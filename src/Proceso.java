
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proceso extends javax.swing.JFrame {

    public Proceso() {
        initComponents();
        //Iniciar el hilo (cronometro)
        cronometro.start();
    }
    //declaracion de  hilo y definir funcion para el cronometro
    Thread cronometro = new Thread() {
        @Override
        public void run() {
            int hora = 0;
            int minuto = 0;
            int segundo = -0;
            for (;;) {
                try {
                    System.out.println(hora + ":" + minuto + ":" + segundo + ":");
                    segundo++;
                    if (segundo == 60) {
                        segundo = 0;
                        minuto++;

                    }
                    if (minuto == 60) {
                        minuto = 0;
                        hora++;

                    }
                    jLabelCronometro.setText(hora + ":" + minuto + ":" + segundo);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelEmpaquetado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelProduccion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelSalida = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelInventario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelInventario = new javax.swing.JLabel();
        jLabelCronometro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 75, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Tiempo Transcurrido");

        jButton1.setText("REGRESAR");

        jButton2.setText("REPORTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanelEmpaquetado.setBackground(new java.awt.Color(153, 0, 153));
        jPanelEmpaquetado.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Empaquetado: ");

        javax.swing.GroupLayout jPanelEmpaquetadoLayout = new javax.swing.GroupLayout(jPanelEmpaquetado);
        jPanelEmpaquetado.setLayout(jPanelEmpaquetadoLayout);
        jPanelEmpaquetadoLayout.setHorizontalGroup(
            jPanelEmpaquetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpaquetadoLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 169, Short.MAX_VALUE))
        );
        jPanelEmpaquetadoLayout.setVerticalGroup(
            jPanelEmpaquetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpaquetadoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );

        jPanelProduccion.setBackground(new java.awt.Color(153, 255, 0));

        jLabel5.setText("Produccion:");

        javax.swing.GroupLayout jPanelProduccionLayout = new javax.swing.GroupLayout(jPanelProduccion);
        jPanelProduccion.setLayout(jPanelProduccionLayout);
        jPanelProduccionLayout.setHorizontalGroup(
            jPanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProduccionLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 173, Short.MAX_VALUE))
        );
        jPanelProduccionLayout.setVerticalGroup(
            jPanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProduccionLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 149, Short.MAX_VALUE))
        );

        jPanelSalida.setBackground(new java.awt.Color(255, 0, 51));

        jLabel6.setText("Salida: ");

        javax.swing.GroupLayout jPanelSalidaLayout = new javax.swing.GroupLayout(jPanelSalida);
        jPanelSalida.setLayout(jPanelSalidaLayout);
        jPanelSalidaLayout.setHorizontalGroup(
            jPanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalidaLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 194, Short.MAX_VALUE))
        );
        jPanelSalidaLayout.setVerticalGroup(
            jPanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalidaLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 149, Short.MAX_VALUE))
        );

        jPanelInventario.setBackground(new java.awt.Color(0, 102, 204));

        jLabel7.setText("Inventario");

        javax.swing.GroupLayout jPanelInventarioLayout = new javax.swing.GroupLayout(jPanelInventario);
        jPanelInventario.setLayout(jPanelInventarioLayout);
        jPanelInventarioLayout.setHorizontalGroup(
            jPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInventarioLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInventarioLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanelInventarioLayout.setVerticalGroup(
            jPanelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInventarioLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jLabelCronometro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Empaquetado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, Short.MAX_VALUE))
                            .addComponent(jPanelSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabelCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int tiempoInventarioProceso = Menu.tiempoInventario;
        int tiempoProduccionProceso = Menu.tiempoProduccion;
        int tiempoEmpaquetadoProceso = Menu.tiempoEmpaquetado;
        int tiempoSalidaProceso = Menu.tiempoSalida;
        int costoInventarioProceso = Menu.costoEmpaquetado;
        int costoProduccionProceso = Menu.costoProduccion;
        int costoEmpaquetadoProceso = Menu.costoEmpaquetado;
        int costoSalidaProceso = Menu.costoSalida;

        int costoInventarioTotal = costoInventarioProceso * tiempoInventarioProceso * 30;
        int costoProduccionTotal = costoProduccionProceso * tiempoProduccionProceso * 30;
        int costoEmpaquetadoTotal = costoEmpaquetadoProceso * tiempoEmpaquetadoProceso * 30;
        int costoSalidaTotal = costoSalidaProceso * tiempoSalidaProceso * 30;
        int costoTotal = costoInventarioTotal + costoProduccionTotal + costoEmpaquetadoTotal + costoSalidaTotal;
        System.out.println("costo de inventario " + costoInventarioTotal);
        System.out.println("costo de produccion " + costoProduccionTotal);
        System.out.println("costo de empaquetado " + costoEmpaquetadoTotal);
        System.out.println("costo de salida " + costoSalidaTotal);
        System.out.println("-------------------------");
        System.out.println("La suma total es:    " + costoTotal);

        //File archivo=new File("C:/Users/Coca/Downloads/Reporte.html");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:/Users/Coca/Downloads/Reporte.html");
            String html = "";
            //Inicio html
            html += """
                    <!DOCTYPE html>
                    <html>
                    <body Style="text-align:center;">
                    
                    <h1>Reporte</h1>
                    <p>Total Costos</p>
                    
                    """;
            //Yabla de datos
            html += """
                    <div Style="text-align:center;">
                    <table>
                      <tr>
                        <th>Sector</th>
                        <th>Total</th>
                      </tr>
                      <tr>
                        <td>Inventario</td>
                        <td>""" + costoInventarioTotal + "</td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "    <td>Producción</td>\n"
                    + "    <td>" + costoProduccionTotal + "</td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "    <td>Empaquetado</td>\n"
                    + "    <td>" + costoEmpaquetadoTotal + "</td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "    <td>Salida</td>\n"
                    + "    <td>" + costoSalidaTotal + "</td>\n"
                    + "  </tr>\n"
                    + "</table>";

            //Total
            html += """
                     <br> <table>
                      <tr>
                        <th>Total</th>
                        <th>Nombre</th>
                        <th>Carnet</th>
                      </tr>
                      <tr>
                        <td>""" + costoTotal
                    + """
                        </td>
                        <td>Oscar Aguilon</td>
                        <td>201831495</td>
                      </tr>
                    </table>
                      </div>
                      """;

            //Fin HTML
            html += """
                    </body>
                    </html>""";
            
            fileWriter.write(html);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error al crear archivo html");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCronometro;
    private javax.swing.JLabel jLabelInventario;
    private javax.swing.JPanel jPanelEmpaquetado;
    private javax.swing.JPanel jPanelInventario;
    private javax.swing.JPanel jPanelProduccion;
    private javax.swing.JPanel jPanelSalida;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the hilo1
     */
//    public Thread getCronometro() {
//        return hilo1;
//    }
//
//    /**
//     * @param cronometro the hilo1 to set
//     */
//    public void setCronometro(Thread cronometro) {
//        this.hilo1 = cronometro;
//    }
}
