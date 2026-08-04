package defpackage;

import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13678l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f26711l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26712l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26713l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f26714l;

    public /* synthetic */ C13678l(int i, int i2, C18289l c18289l, int i3) {
        this.f26713l = i3;
        this.f26712l = i;
        this.f26711l = i2;
        this.f26714l = c18289l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26713l;
        int i2 = this.f26711l;
        int i3 = this.f26712l;
        Object obj2 = this.f26714l;
        switch (i) {
            case 0:
                C2566l c2566l = (C2566l) obj;
                long jLoadAd = AbstractC2296l.loadAd(0, c2566l.f5577l.length());
                C17219l c17219l = (C17219l) ((C18289l) obj2).loadAd;
                long jM4291switch = c17219l.m4291switch(jLoadAd);
                int iMopub = C12814l.mopub(jM4291switch);
                int iBilling = C12814l.billing(jM4291switch);
                if (i3 < iMopub) {
                    i3 = iMopub;
                }
                if (i3 <= iBilling) {
                    iBilling = i3;
                }
                int iMopub2 = C12814l.mopub(jM4291switch);
                int iBilling2 = C12814l.billing(jM4291switch);
                if (i2 < iMopub2) {
                    i2 = iMopub2;
                }
                if (i2 <= iBilling2) {
                    iBilling2 = i2;
                }
                c2566l.mopub(c17219l.m4279case(AbstractC2296l.loadAd(iBilling, iBilling2)));
                break;
            case 1:
                C18289l c18289l = (C18289l) obj2;
                C17219l c17219l2 = (C17219l) c18289l.crashlytics;
                C17219l c17219l3 = (C17219l) c18289l.loadAd;
                C2566l c2566l2 = (C2566l) obj;
                if (i3 < 0 || i2 < 0) {
                    AbstractC14825l.yandex("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long jM4291switch2 = c17219l3.m4291switch(c2566l2.f5585l);
                int iBilling3 = C12814l.billing(jM4291switch2);
                int iM4280catch = iBilling3 + i2;
                if (((i2 ^ iM4280catch) & (iBilling3 ^ iM4280catch)) < 0) {
                    iM4280catch = c17219l2.m4280catch();
                }
                long jM4279case = c17219l3.m4279case(AbstractC2296l.loadAd(C12814l.billing(jM4291switch2), Math.min(iM4280catch, c17219l2.m4280catch())));
                AbstractC12272l.purchase(c2566l2, C12814l.mopub(jM4279case), C12814l.billing(jM4279case));
                int iMopub3 = C12814l.mopub(jM4291switch2);
                int i4 = iMopub3 - i3;
                if (((iMopub3 ^ i4) & (i3 ^ iMopub3)) < 0) {
                    i4 = 0;
                }
                long jM4279case2 = c17219l3.m4279case(AbstractC2296l.loadAd(Math.max(0, i4), C12814l.mopub(jM4291switch2)));
                AbstractC12272l.purchase(c2566l2, C12814l.mopub(jM4279case2), C12814l.billing(jM4279case2));
                break;
            case 2:
                C18289l c18289l2 = (C18289l) obj2;
                C2566l c2566l3 = (C2566l) obj;
                C12814l c12814l = c2566l3.f5578l;
                C13545l c13545l = c2566l3.f5577l;
                if (c12814l != null) {
                    c2566l3.billing(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long jM4279case3 = ((C17219l) c18289l2.loadAd).m4279case(AbstractC2296l.loadAd(i3, i2));
                int iPurchase = AbstractC8576l.purchase(C12814l.mopub(jM4279case3), 0, c13545l.length());
                int iPurchase2 = AbstractC8576l.purchase(C12814l.billing(jM4279case3), 0, c13545l.length());
                if (iPurchase != iPurchase2) {
                    if (iPurchase < iPurchase2) {
                        c2566l3.purchase(iPurchase, iPurchase2, null);
                    } else {
                        c2566l3.purchase(iPurchase2, iPurchase, null);
                    }
                }
                break;
            default:
                C9902l c9902l = (C9902l) obj2;
                C5048l c5048l = (C5048l) obj;
                C7546l c7546l = c5048l.yandex;
                int iAmazon = c5048l.amazon(i3);
                int iAmazon2 = c5048l.amazon(i2);
                CharSequence charSequence = (CharSequence) c7546l.f15548l;
                if (iAmazon < 0 || iAmazon > iAmazon2 || iAmazon2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbSubscription = AbstractC14814l.subscription(iAmazon, iAmazon2, "start(", ") or end(", ") is out of range [0..");
                    sbSubscription.append(length);
                    sbSubscription.append("], or start > end!");
                    AbstractC1786l.yandex(sbSubscription.toString());
                }
                Path path = new Path();
                C18118l c18118l = (C18118l) c7546l.f15549l;
                c18118l.billing.getSelectionPath(iAmazon, iAmazon2, path);
                int i5 = c18118l.admob;
                if (i5 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i5);
                }
                C9902l c9902l2 = new C9902l(path);
                c9902l2.smaato((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c5048l.billing)) & 4294967295L));
                c9902l.yandex(c9902l2, 0L);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13678l(Object obj, int i, int i2, int i3) {
        this.f26713l = i3;
        this.f26714l = obj;
        this.f26712l = i;
        this.f26711l = i2;
    }
}
