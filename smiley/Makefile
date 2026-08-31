all:
	$(CC) $(CFLAGS) smile.c -o smile $(LDFLAGS)
install:
	install -d $(DESTDIR)/usr/bin
	install -m 0755 smile $(DESTDIR)/usr/bin
clean:
	rm -f smile
