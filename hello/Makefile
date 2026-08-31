all:
	$(CC) $(CFLAGS) hello.c -o hello $(LDFLAGS)
install:
	install -d $(DESTDIR)/usr/bin
	install -m 0755 hello $(DESTDIR)/usr/bin
clean:
	rm -f hello
