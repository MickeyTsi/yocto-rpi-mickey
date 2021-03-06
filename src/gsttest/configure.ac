
AC_PREREQ(2.61)

AC_INIT([gsttest],1.0.0)

AM_INIT_AUTOMAKE([foreign])

AC_CONFIG_HEADERS([config.h])
AC_CONFIG_MACRO_DIR([m4])

AM_PROG_AS
AC_PROG_CC
AM_PROG_CC_C_O
AC_PROG_CXX
AC_PROG_LIBTOOL
AC_PROG_AWK
AC_PROG_CPP
AC_PROG_INSTALL
AC_PROG_LN_S
AC_PROG_MAKE_SET
PKG_PROG_PKG_CONFIG

PKG_CHECK_MODULES([GIO], [gio-2.0])
AC_SUBST([GIO_CFLAGS])
AC_SUBST([GIO_LIBS])

AC_ARG_WITH([gstreamer],
	AC_HELP_STRING([--with-gstreamer],
		[enable gstreamer, Build against gstreamer]))

if (test "x${with_gstreamer}" = "xyes"); then
	PKG_CHECK_MODULES(GSTREAMER, gstreamer-1.0 >= 1.10.4, dummy=yes,
							AC_MSG_ERROR(gstreamer-1.0 >= 1.10.4 is required))
	GSTREAMER_CFLAGS="$GSTREAMER_CFLAGS"
	GSTREAMER_LIBS="$GSTREAMER_LIBS"

	AC_SUBST(GSTREAMER_CFLAGS)
	AC_SUBST(GSTREAMER_LIBS)

	PKG_CHECK_MODULES(GSTREAMER_BASE, gstreamer-plugins-base-1.0 >= 1.10.4, dummy=yes,
							AC_MSG_ERROR(gstreamer-plugins-base-1.0 >= 1.10.4 is required))
	GSTREAMER_CFLAGS="$GSTREAMER_BASE_CFLAGS"
	GSTREAMER_LIBS="$GSTREAMER_BASE_LIBS"

	AC_SUBST(GSTREAMER_BASE_CFLAGS)
	AC_SUBST(GSTREAMER_BASE_LIBS)

	PKG_CHECK_MODULES(GSTREAMER_APP, gstreamer-app-1.0 >= 1.10.4, dummy=yes,
							AC_MSG_ERROR(gstreamer-app-1.0 >= 1.10.4 is required))
	GSTREAMER_CFLAGS="$GSTREAMER_APP_CFLAGS"
	GSTREAMER_LIBS="$GSTREAMER_APP_LIBS"

	AC_SUBST(GSTREAMER_APP_CFLAGS)
	AC_SUBST(GSTREAMER_APP_LIBS)

	PKG_CHECK_MODULES(GSTREAMER_AUD, gstreamer-audio-1.0 >= 1.10.4, dummy=yes,
							AC_MSG_ERROR(gstreamer-audio-1.0 >= 1.10.4 is required))
	GSTREAMER_CFLAGS="$GSTREAMER_AUD_CFLAGS"
	GSTREAMER_LIBS="$GSTREAMER_AUD_LIBS"

	AC_SUBST(GSTREAMER_AUD_CFLAGS)
	AC_SUBST(GSTREAMER_AUD_LIBS)
fi

AC_CONFIG_FILES([Makefile])

AC_OUTPUT