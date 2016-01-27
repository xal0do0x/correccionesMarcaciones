/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import com.personal.utiles.ModeloTabla;
import controlador.ReaderControlador;
import entidades.EventLog;
import entidades.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aldo
 */
public class MTEventLog extends ModeloTabla<EventLog>{
    
    private ReaderControlador rc = new ReaderControlador();
    
    public MTEventLog(List<EventLog> datos){
        super(datos);
        this.nombreColumnas = new String[]{"Fecha y hora","Equipo"};
    }
    
    @Override
    public Object getValorEn(int rowIndex, int columnIndex) {
        EventLog evento = this.datos.get(rowIndex); 
        switch(columnIndex){
            case 0:
                Long l = (long) evento.getnDateTime();
                return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(l*1000));
            case 1:
                Reader dispositivo = rc.buscarReaderXID(evento.getnReaderIdn()).get(0);
                return dispositivo.getSName();
                default:
                    return null;
        }
    }
}
