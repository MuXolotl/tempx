package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: lؚّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12680l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final short[][][] f24987l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f24988l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final short[][] f24989l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final short[][][] f24990l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final byte[] f24991l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final short[][][] f24992l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final byte[] f24993l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final short[][] f24994l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final short[][] f24995l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final short[][][] f24996l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final short[][][] f24997l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final short[][] f24998l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final short[][][] f24999l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final short[][][] f25000l;

    public C12680l(C9566l c9566l, byte[] bArr) {
        super(true, c9566l);
        AbstractC1821l abstractC1821l = c9566l.f19504l;
        int i = c9566l.f19498l;
        int i2 = c9566l.f19500l;
        int i3 = c9566l.f19501l;
        int i4 = c9566l.f19499l;
        Class cls = Short.TYPE;
        int i5 = 0;
        if (i4 != 3) {
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
            this.f24995l = sArr;
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, i3, i2);
            this.f24994l = sArr2;
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, i3, i);
            this.f24989l = sArr3;
            short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
            this.f24998l = sArr4;
            short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
            this.f24990l = sArr5;
            short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i2);
            this.f24997l = sArr6;
            short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i3);
            this.f24992l = sArr7;
            short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i2);
            this.f24999l = sArr8;
            short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i);
            this.f24996l = sArr9;
            short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i2);
            this.f24987l = sArr10;
            short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i);
            this.f25000l = sArr11;
            this.f24993l = null;
            byte[] bArrVip = AbstractC14024l.vip(0, 32, bArr);
            this.f24988l = bArrVip;
            int length = bArrVip.length;
            int iFirebase = AbstractC3206l.firebase(sArr, bArr, length) + length;
            int iFirebase2 = AbstractC3206l.firebase(sArr2, bArr, iFirebase) + iFirebase;
            int iFirebase3 = AbstractC3206l.firebase(sArr3, bArr, iFirebase2) + iFirebase2;
            int iFirebase4 = AbstractC3206l.firebase(sArr4, bArr, iFirebase3) + iFirebase3;
            int iSmaato = AbstractC3206l.smaato(sArr5, bArr, iFirebase4, true) + iFirebase4;
            int iSmaato2 = AbstractC3206l.smaato(sArr6, bArr, iSmaato, false) + iSmaato;
            int iSmaato3 = AbstractC3206l.smaato(sArr7, bArr, iSmaato2, true) + iSmaato2;
            int iSmaato4 = AbstractC3206l.smaato(sArr8, bArr, iSmaato3, false) + iSmaato3;
            int iSmaato5 = AbstractC3206l.smaato(sArr9, bArr, iSmaato4, false) + iSmaato4;
            int iSmaato6 = AbstractC3206l.smaato(sArr10, bArr, iSmaato5, true) + iSmaato5;
            this.f24991l = AbstractC14024l.vip(AbstractC3206l.smaato(sArr11, bArr, iSmaato6, false) + iSmaato6, bArr.length, bArr);
            return;
        }
        byte[] bArrVip2 = AbstractC14024l.vip(0, 32, bArr);
        this.f24993l = bArrVip2;
        byte[] bArrVip3 = AbstractC14024l.vip(32, 64, bArr);
        this.f24988l = bArrVip3;
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArrVip3);
        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArrVip2);
        C2875l c2875l = new C2875l(bArrCrashlytics, abstractC1821l);
        C2875l c2875l2 = new C2875l(bArrCrashlytics2, abstractC1821l);
        short[][] sArrMopub = AbstractC3206l.mopub(c2875l, i2, i);
        short[][] sArrMopub2 = AbstractC3206l.mopub(c2875l, i3, i2);
        short[][] sArrMopub3 = AbstractC3206l.mopub(c2875l, i3, i);
        short[][] sArrMopub4 = AbstractC3206l.mopub(c2875l, i2, i);
        short[][] sArrYandex = AbstractC16164l.yandex(AbstractC16164l.admob(sArrMopub2, sArrMopub4), sArrMopub3);
        short[][][] sArrBilling = AbstractC3206l.billing(c2875l2, i2, i3, i3, true);
        short[][][] sArrBilling2 = AbstractC3206l.billing(c2875l2, i2, i3, i2, false);
        short[][][] sArrBilling3 = AbstractC3206l.billing(c2875l2, i, i3, i3, true);
        short[][][] sArrBilling4 = AbstractC3206l.billing(c2875l2, i, i3, i2, false);
        short[][][] sArrBilling5 = AbstractC3206l.billing(c2875l2, i, i3, i, false);
        short[][][] sArrBilling6 = AbstractC3206l.billing(c2875l2, i, i2, i2, true);
        short[][][] sArrBilling7 = AbstractC3206l.billing(c2875l2, i, i2, i, false);
        short[][][] sArrSubs = AbstractC16164l.subs(sArrMopub, sArrBilling3, sArrBilling);
        short[][][] sArrSubs2 = AbstractC16164l.subs(sArrMopub, sArrBilling4, sArrBilling2);
        short[][][] sArrCrashlytics = AbstractC3206l.crashlytics(sArrSubs);
        short[][][] sArr12 = new short[i2][][];
        while (i5 < i2) {
            short[][][] sArr13 = sArrBilling3;
            short[][] sArrLoadAd = AbstractC16164l.loadAd(sArrSubs[i5]);
            sArr12[i5] = sArrLoadAd;
            short[][] sArrAdmob = AbstractC16164l.admob(sArrLoadAd, sArrMopub2);
            sArr12[i5] = sArrAdmob;
            sArr12[i5] = AbstractC16164l.yandex(sArrAdmob, sArrSubs2[i5]);
            i5++;
            sArrBilling4 = sArrBilling4;
            sArrBilling3 = sArr13;
        }
        short[][][] sArr14 = sArrBilling3;
        short[][][] sArr15 = sArrBilling4;
        short[][][] sArr16 = new short[i][][];
        short[][][] sArr17 = new short[i][][];
        short[][][] sArr18 = new short[i][][];
        short[][][] sArr19 = new short[i][][];
        short[][][] sArrCrashlytics2 = AbstractC3206l.crashlytics(sArr14);
        int i6 = 0;
        while (i6 < i) {
            short[][][] sArr20 = sArr16;
            short[][] sArrLoadAd2 = AbstractC16164l.loadAd(sArr14[i6]);
            short[][][] sArr21 = sArr19;
            short[][] sArrAdmob2 = AbstractC16164l.admob(sArrLoadAd2, sArrMopub2);
            sArr20[i6] = sArrAdmob2;
            short[][][] sArr22 = sArr12;
            sArr20[i6] = AbstractC16164l.yandex(sArrAdmob2, sArr15[i6]);
            sArr17[i6] = AbstractC16164l.admob(sArrLoadAd2, sArrYandex);
            short[][] sArrYandex2 = AbstractC16164l.yandex(sArr17[i6], AbstractC16164l.admob(sArr15[i6], sArrMopub4));
            sArr17[i6] = sArrYandex2;
            sArr17[i6] = AbstractC16164l.yandex(sArrYandex2, sArrBilling5[i6]);
            short[][] sArrYandex3 = AbstractC16164l.yandex(AbstractC16164l.admob(sArr14[i6], sArrMopub2), sArr15[i6]);
            short[][] sArrFirebase = AbstractC16164l.firebase(sArrMopub2);
            short[][] sArrAdmob3 = AbstractC16164l.admob(sArrFirebase, sArrYandex3);
            sArr18[i6] = sArrAdmob3;
            short[][] sArrYandex4 = AbstractC16164l.yandex(sArrAdmob3, sArrBilling6[i6]);
            sArr18[i6] = sArrYandex4;
            short[][] sArr23 = sArrMopub;
            if (sArrYandex4.length != sArrYandex4[0].length) {
                C18073l.license("Computation to upper triangular matrix is not possible!");
                throw null;
            }
            short[][] sArr24 = (short[][]) Array.newInstance((Class<?>) cls, sArrYandex4.length, sArrYandex4.length);
            int i7 = 0;
            while (i7 < sArrYandex4.length) {
                sArr24[i7][i7] = sArrYandex4[i7][i7];
                short[][] sArr25 = sArrYandex4;
                int i8 = i7 + 1;
                while (i8 < sArr25[0].length) {
                    short[] sArr26 = sArr24[i7];
                    short s = sArr25[i7][i8];
                    short s2 = sArr25[i8][i7];
                    byte[][] bArr2 = AbstractC8328l.yandex;
                    int i9 = i8;
                    sArr26[i9] = (short) (s ^ s2);
                    i8 = i9 + 1;
                }
                sArrYandex4 = sArr25;
                i7 = i8;
            }
            sArr18[i6] = sArr24;
            sArr21[i6] = AbstractC16164l.admob(sArrFirebase, sArr17[i6]);
            sArr21[i6] = AbstractC16164l.yandex(sArr21[i6], AbstractC16164l.admob(AbstractC16164l.firebase(sArr15[i6]), sArrYandex));
            short[][] sArrYandex5 = AbstractC16164l.yandex(sArr21[i6], AbstractC16164l.admob(AbstractC16164l.loadAd(sArrBilling6[i6]), sArrMopub4));
            sArr21[i6] = sArrYandex5;
            sArr21[i6] = AbstractC16164l.yandex(sArrYandex5, sArrBilling7[i6]);
            i6++;
            sArr19 = sArr21;
            sArr16 = sArr20;
            sArr12 = sArr22;
            sArrMopub = sArr23;
        }
        C12680l c12680l = new C12680l(c9566l, bArrCrashlytics, sArrMopub, sArrMopub2, sArrMopub4, sArrYandex, sArrCrashlytics, sArr12, sArrCrashlytics2, sArr16, sArr17, sArr18, sArr19);
        this.f24991l = null;
        this.f24995l = c12680l.f24995l;
        this.f24994l = c12680l.f24994l;
        this.f24998l = c12680l.f24998l;
        this.f24989l = c12680l.f24989l;
        this.f24990l = c12680l.f24990l;
        this.f24997l = c12680l.f24997l;
        this.f24992l = c12680l.f24992l;
        this.f24999l = c12680l.f24999l;
        this.f24996l = c12680l.f24996l;
        this.f24987l = c12680l.f24987l;
        this.f25000l = c12680l.f25000l;
    }

    public final byte[] getEncoded() {
        int i = ((C9566l) this.f16541l).f19499l;
        byte[] bArr = this.f24988l;
        byte[] bArr2 = this.f24993l;
        if (i == 3) {
            return AbstractC14024l.mopub(bArr2, bArr);
        }
        return AbstractC14024l.mopub(i == 3 ? AbstractC14024l.mopub(bArr2, bArr) : AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(AbstractC14024l.mopub(bArr, AbstractC3206l.admob(this.f24995l)), AbstractC3206l.admob(this.f24994l)), AbstractC3206l.admob(this.f24989l)), AbstractC3206l.admob(this.f24998l)), AbstractC3206l.subs(this.f24990l, true)), AbstractC3206l.subs(this.f24997l, false)), AbstractC3206l.subs(this.f24992l, true)), AbstractC3206l.subs(this.f24999l, false)), AbstractC3206l.subs(this.f24996l, false)), AbstractC3206l.subs(this.f24987l, true)), AbstractC3206l.subs(this.f25000l, false)), this.f24991l);
    }

    public C12680l(C9566l c9566l, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, c9566l);
        this.f24993l = null;
        this.f24991l = null;
        this.f24988l = (byte[]) bArr.clone();
        this.f24995l = AbstractC3206l.loadAd(sArr);
        this.f24994l = AbstractC3206l.loadAd(sArr2);
        this.f24998l = AbstractC3206l.loadAd(sArr3);
        this.f24989l = AbstractC3206l.loadAd(sArr4);
        this.f24990l = AbstractC3206l.crashlytics(sArr5);
        this.f24997l = AbstractC3206l.crashlytics(sArr6);
        this.f24992l = AbstractC3206l.crashlytics(sArr7);
        this.f24999l = AbstractC3206l.crashlytics(sArr8);
        this.f24996l = AbstractC3206l.crashlytics(sArr9);
        this.f24987l = AbstractC3206l.crashlytics(sArr10);
        this.f25000l = AbstractC3206l.crashlytics(sArr11);
    }
}
