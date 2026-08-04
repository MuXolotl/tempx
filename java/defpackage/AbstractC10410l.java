package defpackage;

import java.io.InputStream;

/* JADX INFO: renamed from: lَٛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10410l extends InputStream {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f21226l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InputStream f21227l;

    public AbstractC10410l(InputStream inputStream, int i) {
        this.f21227l = inputStream;
        this.f21226l = i;
    }

    public final void yandex() {
        InputStream inputStream = this.f21227l;
        if (inputStream instanceof C18147l) {
            C18147l c18147l = (C18147l) inputStream;
            c18147l.f35515l = true;
            c18147l.billing();
        }
    }
}
