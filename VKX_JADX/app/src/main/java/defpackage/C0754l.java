package defpackage;

import j$.util.Objects;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lٖؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0754l implements InterfaceC14833l {
    public InterfaceC10430l admob;
    public int amazon;
    public int crashlytics;
    public C17363l isPro;
    public InterfaceC2053l loadAd;
    public C16542l mopub;
    public int purchase;
    public C3253l subs;
    public final C13143l yandex = new C13143l(2);
    public long billing = -1;

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        if (j == 0) {
            this.crashlytics = 0;
            this.isPro = null;
        } else if (this.crashlytics == 5) {
            C17363l c17363l = this.isPro;
            c17363l.getClass();
            c17363l.amazon(j, j2);
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.loadAd = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        String strLicense;
        C11826l c11826l = (C11826l) interfaceC10430l;
        C13143l c13143l = this.yandex;
        c13143l.m3563native(2);
        c11826l.billing(c13143l.yandex, 0, 2, false);
        if (c13143l.m3567synchronized() == 65496) {
            while (true) {
                c13143l.m3563native(2);
                c11826l.billing(c13143l.yandex, 0, 2, false);
                int iM3567synchronized = c13143l.m3567synchronized();
                this.amazon = iM3567synchronized;
                if (iM3567synchronized == 65498) {
                    break;
                }
                c13143l.m3563native(2);
                c11826l.yandex(0, 2, c13143l.yandex);
                int iM3567synchronized2 = c13143l.m3567synchronized() - 2;
                if (iM3567synchronized2 < 0) {
                    break;
                }
                if (this.amazon != 65505) {
                    c11826l.firebase(iM3567synchronized2, false);
                } else {
                    c13143l.m3563native(iM3567synchronized2);
                    c11826l.billing(c13143l.yandex, 0, iM3567synchronized2, false);
                    if (Objects.equals(c13143l.license(), "http://ns.adobe.com/xap/1.0/") && (strLicense = c13143l.license()) != null) {
                        String[] strArr = AbstractC5573l.loadAd;
                        for (int i = 0; i < 4; i++) {
                            if (strLicense.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        String strLicense;
        C3253l c3253lMopub;
        C13708l c13708l;
        int i;
        C16542l c16542l;
        long j;
        int i2 = this.crashlytics;
        long j2 = -1;
        C13143l c13143l = this.yandex;
        if (i2 == 0) {
            c13143l.m3563native(2);
            interfaceC10430l.readFully(c13143l.yandex, 0, 2);
            int iM3567synchronized = c13143l.m3567synchronized();
            this.amazon = iM3567synchronized;
            if (iM3567synchronized == 65498) {
                if (this.billing != -1) {
                    this.crashlytics = 4;
                    return 0;
                }
                mopub();
                return 0;
            }
            if ((iM3567synchronized < 65488 || iM3567synchronized > 65497) && iM3567synchronized != 65281) {
                this.crashlytics = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            c13143l.m3563native(2);
            interfaceC10430l.yandex(0, 2, c13143l.yandex);
            this.purchase = c13143l.m3567synchronized() - 2;
            interfaceC10430l.remoteconfig(2);
            this.crashlytics = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    C18073l.admob();
                    return 0;
                }
                if (this.subs == null || interfaceC10430l != this.admob) {
                    this.admob = interfaceC10430l;
                    this.subs = new C3253l(interfaceC10430l, this.billing);
                }
                C17363l c17363l = this.isPro;
                c17363l.getClass();
                int iLoadAd = c17363l.loadAd(this.subs, c1014l);
                if (iLoadAd == 1) {
                    c1014l.f2761l += this.billing;
                }
                return iLoadAd;
            }
            long position = interfaceC10430l.getPosition();
            long j3 = this.billing;
            if (position != j3) {
                c1014l.f2761l = j3;
                return 1;
            }
            if (!interfaceC10430l.billing(c13143l.yandex, 0, 1, true)) {
                mopub();
                return 0;
            }
            interfaceC10430l.smaato();
            if (this.isPro == null) {
                this.isPro = new C17363l(InterfaceC5304l.f11423l, 8);
            }
            C3253l c3253l = new C3253l(interfaceC10430l, this.billing);
            this.subs = c3253l;
            if (!this.isPro.crashlytics(c3253l)) {
                mopub();
                return 0;
            }
            C17363l c17363l2 = this.isPro;
            long j4 = this.billing;
            InterfaceC2053l interfaceC2053l = this.loadAd;
            interfaceC2053l.getClass();
            c17363l2.billing(new C3253l(j4, interfaceC2053l, 5));
            C16542l c16542l2 = this.mopub;
            c16542l2.getClass();
            InterfaceC2053l interfaceC2053l2 = this.loadAd;
            interfaceC2053l2.getClass();
            InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l2.startapp(1024, 4);
            C12984l c12984l = new C12984l();
            c12984l.remoteconfig = AbstractC3825l.vip("image/jpeg");
            c12984l.firebase = new C7417l(c16542l2);
            AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
            this.crashlytics = 5;
            return 0;
        }
        if (this.amazon == 65505) {
            C13143l c13143l2 = new C13143l(this.purchase);
            interfaceC10430l.readFully(c13143l2.yandex, 0, this.purchase);
            if (this.mopub == null && "http://ns.adobe.com/xap/1.0/".equals(c13143l2.license()) && (strLicense = c13143l2.license()) != null) {
                long length = interfaceC10430l.getLength();
                if (length == -1) {
                    c16542l = null;
                } else {
                    try {
                        c3253lMopub = AbstractC5573l.mopub(strLicense);
                    } catch (NumberFormatException | C17655l | XmlPullParserException unused) {
                        AbstractC6427l.vip("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c3253lMopub = null;
                    }
                    if (c3253lMopub != null && (i = (c13708l = (C13708l) c3253lMopub.f6947l).f26765l) >= 2) {
                        int i3 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i3 >= 0) {
                            C4268l c4268l = (C4268l) c13708l.get(i3);
                            String str = c4268l.yandex;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                length -= c4268l.crashlytics;
                                j = 0;
                            } else {
                                j = length - c4268l.loadAd;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i3 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i3--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            c16542l = null;
                        } else {
                            c16542l = new C16542l(j5, j6, c3253lMopub.f6948l, j7, j8);
                        }
                    } else {
                        c16542l = null;
                    }
                }
                this.mopub = c16542l;
                if (c16542l != null) {
                    this.billing = c16542l.amazon;
                }
            }
        } else {
            interfaceC10430l.remoteconfig(this.purchase);
        }
        this.crashlytics = 0;
        return 0;
    }

    public final void mopub() {
        InterfaceC2053l interfaceC2053l = this.loadAd;
        interfaceC2053l.getClass();
        interfaceC2053l.firebase();
        this.loadAd.tapsense(new C9828l(-9223372036854775807L));
        this.crashlytics = 6;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
        C17363l c17363l = this.isPro;
        if (c17363l != null) {
            c17363l.getClass();
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
