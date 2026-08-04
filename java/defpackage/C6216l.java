package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: lؙؓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6216l implements InterfaceC17732l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f13136l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f13137l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f13138l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f13139l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6673l f13140l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f13141l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f13142l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC2634l f13143l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public long f13144l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f13145l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f13146l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f13147l;

    public C6216l(AbstractC2634l abstractC2634l, long j, long j2, long j3, long j4, boolean z) {
        AbstractC12442l.admob(j >= 0 && j2 > j);
        this.f13143l = abstractC2634l;
        this.f13139l = j;
        this.f13136l = j2;
        if (j3 == j2 - j || z) {
            this.f13146l = j4;
            this.f13142l = 4;
        } else {
            this.f13142l = 0;
        }
        this.f13140l = new C6673l();
    }

    @Override // defpackage.InterfaceC17732l
    public final void amazon(long j) {
        this.f13138l = AbstractC15323l.firebase(j, 0L, this.f13146l - 1);
        this.f13142l = 2;
        this.f13145l = this.f13139l;
        this.f13141l = this.f13136l;
        this.f13147l = 0L;
        this.f13144l = this.f13146l;
    }

    @Override // defpackage.InterfaceC17732l
    public final InterfaceC12703l crashlytics() {
        if (this.f13146l != 0) {
            return new C15001l(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // defpackage.InterfaceC17732l
    public final long yandex(InterfaceC10430l interfaceC10430l) throws IOException {
        long j;
        long jFirebase;
        int i = this.f13142l;
        long j2 = this.f13136l;
        C6673l c6673l = this.f13140l;
        if (i == 0) {
            long position = interfaceC10430l.getPosition();
            this.f13137l = position;
            this.f13142l = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f13145l == this.f13141l) {
                    jFirebase = -1;
                } else {
                    long position2 = interfaceC10430l.getPosition();
                    if (c6673l.loadAd(interfaceC10430l, this.f13141l)) {
                        c6673l.yandex(interfaceC10430l, false);
                        interfaceC10430l.smaato();
                        long j4 = this.f13138l;
                        long j5 = c6673l.loadAd;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = c6673l.amazon + c6673l.purchase;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.f13141l = position2;
                                this.f13144l = j5;
                            } else {
                                this.f13145l = interfaceC10430l.getPosition() + ((long) i2);
                                this.f13147l = c6673l.loadAd;
                            }
                            long j7 = this.f13141l;
                            long j8 = this.f13145l;
                            if (j7 - j8 < 100000) {
                                this.f13141l = j8;
                                jFirebase = j8;
                            } else {
                                long position3 = interfaceC10430l.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.f13141l;
                                long j10 = this.f13145l;
                                jFirebase = AbstractC15323l.firebase((((j9 - j10) * j6) / (this.f13144l - this.f13147l)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jFirebase = -1;
                        }
                    } else {
                        jFirebase = this.f13145l;
                        if (jFirebase == position2) {
                            C18262l.metrica("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jFirebase != -1) {
                        return jFirebase;
                    }
                    this.f13142l = 3;
                }
                j = 2;
                if (jFirebase != -1) {
                    return jFirebase;
                }
                this.f13142l = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    C18073l.admob();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                c6673l.loadAd(interfaceC10430l, -1L);
                c6673l.yandex(interfaceC10430l, false);
                if (c6673l.loadAd > this.f13138l) {
                    interfaceC10430l.smaato();
                    this.f13142l = 4;
                    return -(this.f13147l + j);
                }
                interfaceC10430l.remoteconfig(c6673l.amazon + c6673l.purchase);
                this.f13145l = interfaceC10430l.getPosition();
                this.f13147l = c6673l.loadAd;
            }
        }
        c6673l.yandex = 0;
        c6673l.loadAd = 0L;
        c6673l.crashlytics = 0;
        c6673l.amazon = 0;
        c6673l.purchase = 0;
        if (!c6673l.loadAd(interfaceC10430l, -1L)) {
            C8339l.vip();
            return 0L;
        }
        c6673l.yandex(interfaceC10430l, false);
        interfaceC10430l.remoteconfig(c6673l.amazon + c6673l.purchase);
        long j11 = c6673l.loadAd;
        while ((c6673l.yandex & 4) != 4 && c6673l.loadAd(interfaceC10430l, -1L) && interfaceC10430l.getPosition() < j2 && c6673l.yandex(interfaceC10430l, true)) {
            try {
                interfaceC10430l.remoteconfig(c6673l.amazon + c6673l.purchase);
                j11 = c6673l.loadAd;
            } catch (EOFException unused) {
            }
        }
        this.f13146l = j11;
        this.f13142l = 4;
        return this.f13137l;
    }
}
