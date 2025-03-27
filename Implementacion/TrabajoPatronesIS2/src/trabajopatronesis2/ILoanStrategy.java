/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author Pablo Aranda Cortés
 */

import java.time.LocalDateTime;

public interface ILoanStrategy 
{
    LocalDateTime calculateLoanFinishDate (LocalDateTime startDate);
}
