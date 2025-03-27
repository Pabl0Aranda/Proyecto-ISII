/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopatronesis2;

import java.time.LocalDateTime;

/**
 *
 * @author Pablo Aranda Cortés
 */
public class RestrictedLoanStrategy implements ILoanStrategy
{
    @Override
    public LocalDateTime calculateLoanFinishDate(LocalDateTime startDate) 
    {
        return startDate.plusDays(7);
    }
}
