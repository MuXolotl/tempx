package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: lُٜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11178l implements InterfaceC12702l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C11178l f22474l = new C11178l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3797l f22473l = C3797l.appmetrica("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default */
    public final Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        abstractC9542l.billing();
        String strMo1284package = null;
        float fSignatures = 0.0f;
        float fSignatures2 = 0.0f;
        float fSignatures3 = 0.0f;
        float fSignatures4 = 0.0f;
        int iInmobi = 0;
        int iYandex = 0;
        int iYandex2 = 0;
        boolean zIsVip = true;
        int i = 3;
        String strMo1284package2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC9542l.ads()) {
            switch (abstractC9542l.mo1288throw(f22473l)) {
                case 0:
                    strMo1284package = abstractC9542l.mo1284package();
                    break;
                case 1:
                    strMo1284package2 = abstractC9542l.mo1284package();
                    break;
                case 2:
                    fSignatures = (float) abstractC9542l.signatures();
                    break;
                case 3:
                    int iInmobi2 = abstractC9542l.inmobi();
                    i = (iInmobi2 <= 2 && iInmobi2 >= 0) ? AbstractC5020l.m1673throws(3)[iInmobi2] : 3;
                    break;
                case 4:
                    iInmobi = abstractC9542l.inmobi();
                    break;
                case 5:
                    fSignatures2 = (float) abstractC9542l.signatures();
                    break;
                case 6:
                    fSignatures3 = (float) abstractC9542l.signatures();
                    break;
                case 7:
                    iYandex = AbstractC14878l.yandex(abstractC9542l);
                    break;
                case 8:
                    iYandex2 = AbstractC14878l.yandex(abstractC9542l);
                    break;
                case 9:
                    fSignatures4 = (float) abstractC9542l.signatures();
                    break;
                case 10:
                    zIsVip = abstractC9542l.isVip();
                    break;
                case 11:
                    abstractC9542l.yandex();
                    pointF = new PointF(((float) abstractC9542l.signatures()) * f, ((float) abstractC9542l.signatures()) * f);
                    abstractC9542l.mopub();
                    break;
                case 12:
                    abstractC9542l.yandex();
                    pointF = pointF;
                    pointF2 = new PointF(((float) abstractC9542l.signatures()) * f, ((float) abstractC9542l.signatures()) * f);
                    abstractC9542l.mopub();
                    break;
                default:
                    abstractC9542l.mo1286switch();
                    abstractC9542l.mo1275continue();
                    break;
            }
        }
        abstractC9542l.vip();
        C8253l c8253l = new C8253l();
        c8253l.yandex = strMo1284package;
        c8253l.loadAd = strMo1284package2;
        c8253l.crashlytics = fSignatures;
        c8253l.amazon = i;
        c8253l.purchase = iInmobi;
        c8253l.billing = fSignatures2;
        c8253l.mopub = fSignatures3;
        c8253l.admob = iYandex;
        c8253l.subs = iYandex2;
        c8253l.isPro = fSignatures4;
        c8253l.firebase = zIsVip;
        c8253l.smaato = pointF;
        c8253l.remoteconfig = pointF2;
        return c8253l;
    }
}
