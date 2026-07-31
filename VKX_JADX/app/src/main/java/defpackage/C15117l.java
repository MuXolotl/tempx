package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٕٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15117l implements InterfaceC11759l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2615l f29655l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f29656l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f29657l;

    public C15117l(C2615l c2615l) {
        this.f29655l = c2615l;
    }

    @Override // defpackage.InterfaceC11759l
    public final int adcel(C10023l c10023l, C4136l c4136l, int i) {
        loadAd();
        C2615l c2615l = this.f29655l;
        boolean z = c2615l.f5687l;
        if (z && c2615l.f5678l == null) {
            this.f29657l = 2;
        }
        int i2 = this.f29657l;
        if (i2 == 2) {
            c4136l.yandex(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c10023l.f20418l = c2615l.f5684l;
            this.f29657l = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c2615l.f5678l.getClass();
        c4136l.yandex(1);
        c4136l.f8496l = 0L;
        if ((i & 4) == 0) {
            c4136l.startapp(c2615l.f5691l);
            c4136l.f8498l.put(c2615l.f5678l, 0, c2615l.f5691l);
        }
        if ((i & 1) == 0) {
            this.f29657l = 2;
        }
        return -4;
    }

    @Override // defpackage.InterfaceC11759l
    public final void firebase() throws IOException {
        C2615l c2615l = this.f29655l;
        if (c2615l.f5690l) {
            return;
        }
        C18449l c18449l = c2615l.f5688l;
        IOException iOException = (IOException) c18449l.f36012l;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC9564l handlerC9564l = (HandlerC9564l) c18449l.f36009l;
        if (handlerC9564l != null) {
            int i = handlerC9564l.f19484l;
            IOException iOException2 = handlerC9564l.f19486l;
            if (iOException2 != null && handlerC9564l.f19489l > i) {
                throw iOException2;
            }
        }
    }

    public final void loadAd() {
        if (this.f29656l) {
            return;
        }
        C2615l c2615l = this.f29655l;
        C13698l c13698l = c2615l.f5685l;
        c13698l.subscription(new C15263l(c13698l, new C2040l(1, AbstractC3825l.admob(c2615l.f5684l.metrica), c2615l.f5684l, 0, null, AbstractC15323l.m3986try(0L), -9223372036854775807L), 9));
        this.f29656l = true;
    }

    @Override // defpackage.InterfaceC11759l
    public final int smaato(long j) {
        loadAd();
        if (j <= 0 || this.f29657l == 2) {
            return 0;
        }
        this.f29657l = 2;
        return 1;
    }

    @Override // defpackage.InterfaceC11759l
    public final boolean yandex() {
        return this.f29655l.f5687l;
    }
}
