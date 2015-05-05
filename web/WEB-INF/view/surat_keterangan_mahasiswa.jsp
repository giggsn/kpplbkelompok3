<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Membuat Surat Keterangan Mahasiswa</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        
         <!-- Bootstrap Core CSS -->
        <link href="./bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="./bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="./dist/css/timeline.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="./dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="./bower_components/morrisjs/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="./bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        
        <!-- Custom CSS -->
        <link href="./custom_style/cus.css" rel="stylesheet" type="text/css">
        <style type="text/css">
        #apDiv1 {
	position: absolute;
	width: 72px;
	height: 63px;
	z-index: 1001;
	bottom: 25px;
	right: 25px;
}
        </style>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="home">
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.html">NAMA APLIKASI</a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <li><a href="index.html"><i class="fa fa-sign-out fa-fw"></i>Logout</a>
                </li>
            </ul>

            <ul class="nav navbar-top-links navbar-left">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        Jenis Surat <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                         <li><a href="suratSurveydanData">Surat Survey dan Pengambilan Data</a>
                        </li>
                        <li><a href="suratKeteranganLulus">Surat Keterangan Lulus</a>
                        </li>
                        <li><a href="suratKeteranganMahasiswa">Surat Keterangan Mahasiswa</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
            </ul>
    </nav>
        <div class="col-md-12">
          <p>
            <input type="submit"  value="Preview">
          </p>
          <p> 
            <input type="submit"  value="Submit">
          </p>
        </div>
        <div class="home">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <h1 class="page-header">Membuat Surat Keterangan Mahasiswa</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>

                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <p>Yang bertanda tangan di bawah ini</p>
                    </div>
                    <!-- /.col-lg-12 -->                    
                </div>
                <div class="row">
                    <div class="col-sm-5 col-md-6">
                        <div class="col-sm-8 col-md-12">
                            <form role="form">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Tempat/Tanggal Lahir" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Alamat Sekarang" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Orang Tua/Wali" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Pekerjaan Orang Tua/Wali" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Alamat Orang Tua/Wali" autofocus>
                                </div>
                            </fieldset>
                        </form>
                        </div>
                    </div>                    
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-6">
                        <p>Tercatat sebagai mahasiswa di Jurusan Sistem Informasi FTIf-ITS</p>
                    </div>                    
                </div>
                <div class="row">
                        <div class="col-sm-12 col-md-6">
                            <div class="col-sm-5 col-md-6">
                                <form role="form">
                                    <fieldset>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="NRP" autofocus>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                            <div class="col-sm-5 col-md-6">
                                <form role="form">
                                    <fieldset>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Semester" autofocus>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>                              
                        </div>                 
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-6">
                        <p>Tahap :</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-6 col-md-3">
                        <div class="checkbox">
                            <label>
                                <input name="Persiapan" type="checkbox" value="Persiapan">Persiapan
                            </label>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="checkbox">
                            <label>
                                <input name="Sarjana" type="checkbox" value="Sarjana">Sarjana
                            </label>
                        </div>
                    </div> 
                </div>
                <div class="row">
                    <div class="col-sm-6 col-md-3">
                        <div class="checkbox">
                            <label>
                                <input name="Aktif" type="checkbox" value="Aktif">Aktif
                            </label>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="checkbox">
                            <label>
                                <input name="Cuti" type="checkbox" value="Cuti">Cuti
                            </label>
                        </div>
                    </div> 
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-6">
                        <p>Membuat Surat ini dengan keperluan</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-6">
                        <div class="col-sm-6 col-md-12">
                            <form role="form">
                                <fieldset>
                                    <div class="Form-group">
                                        <input class="form-control" placeholder="Keperluan" autofocus>                                    
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div> 
                </div>
            </div>
        </div>

               
            
        
        <!-- jQuery -->
        <script src="./bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="./bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="./bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="./bower_components/raphael/raphael-min.js"></script>
        <script src="./bower_components/morrisjs/morris.min.js"></script>
        <script src="./js/morris-data.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="./dist/js/sb-admin-2.js"></script>
        <div></div>
    </body>
</html>
