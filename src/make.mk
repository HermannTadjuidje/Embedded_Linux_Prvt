all:
	$(CC) hello.c -o hello
install:
	install -d $(DESTDIR)/usr/bin
	install -m 0755 hello $(DESTDIR)/usr/bin
