/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import DataTransferObject.AsociacionesDTO;
/**
 *
 * @author Aaron
 */
public class interconexion {
    private static AsociacionesDTO asociacionesDTO;

    // Método para obtener la instancia actual
    public static AsociacionesDTO getAsociacionesDTO() {
        return asociacionesDTO;
    }

    // Método para establecer la instancia
    public static void setAsociacionesDTO(AsociacionesDTO dto) {
        asociacionesDTO = dto;
    }
}

