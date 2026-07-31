package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؒۧ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1497l {
    public static final C15578l loadAd = new C15578l(-321446351, false, new C11813l(24));
    public static C5599l yandex;

    public static C9676l amazon(String str, AbstractC2017l abstractC2017l, boolean z) {
        AbstractC16336l.amazon(abstractC2017l.f4542l.f16360l);
        return new C9676l(str, abstractC2017l);
    }

    public static final float billing(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC6290l.yandex;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? AbstractC13650l.yandex[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final void crashlytics(C13432l c13432l, String str) {
        C11120l c11120lLoadAd;
        WorkDatabase workDatabase = c13432l.crashlytics;
        C9280l c9280lSignature = workDatabase.Signature();
        C13664l c13664lStartapp = workDatabase.startapp();
        ArrayList arrayListMetrica = AbstractC14055l.metrica(str);
        while (!arrayListMetrica.isEmpty()) {
            String str2 = (String) AbstractC3984l.isVip(arrayListMetrica);
            EnumC9176l enumC9176lCrashlytics = c9280lSignature.crashlytics(str2);
            if (enumC9176lCrashlytics != EnumC9176l.f18875l && enumC9176lCrashlytics != EnumC9176l.f18880l) {
                ((Number) AbstractC2021l.purchase(c9280lSignature.yandex, false, true, new C6908l(str2, 28))).intValue();
            }
            arrayListMetrica.addAll(c13664lStartapp.yandex(str2));
        }
        C5648l c5648l = c13432l.billing;
        synchronized (c5648l.firebase) {
            C14513l.tapsense().vip(C5648l.smaato, "Processor cancelling " + str);
            c5648l.subs.add(str);
            c11120lLoadAd = c5648l.loadAd(str);
        }
        C5648l.purchase(str, c11120lLoadAd, 1);
        Iterator it = c13432l.purchase.iterator();
        while (it.hasNext()) {
            ((InterfaceC15402l) it.next()).amazon(str);
        }
    }

    public static final void loadAd(final boolean z, final boolean z2, InterfaceC17242l interfaceC17242l, final float f, C6956l c6956l, final int i, final int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        final InterfaceC17242l interfaceC17242l3;
        c6956l.m2133new(1799700514);
        if ((i & 6) == 0) {
            i3 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.mopub(z2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i4 = i3 | (c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= c6956l.crashlytics(f) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i4 & 1, (i4 & 1171) != 1170)) {
            InterfaceC17242l interfaceC17242l4 = i5 != 0 ? C4346l.f8873l : interfaceC17242l2;
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zAmazon = c6956l.amazon(iAdmob);
            Object objM2132native = c6956l.m2132native();
            if (zAmazon || objM2132native == C1867l.yandex) {
                objM2132native = new C2221l(iAdmob, 19);
                c6956l.m2147try(objM2132native);
            }
            AbstractC7741l.loadAd(boolValueOf, interfaceC17242l4, (Function1) objM2132native, null, "", null, AbstractC14566l.amazon(-1172285979, new Function4() { // from class: lٖؕۜ
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    C6956l c6956l2 = (C6956l) obj3;
                    ((Integer) obj4).getClass();
                    if (zBooleanValue) {
                        c6956l2.m2123default(-1192477427);
                        AbstractC12491l.yandex(null, ((C9735l) c6956l2.isPro(AbstractC12502l.yandex)).yandex, 2.0f, 24.0f, c6956l2, 3456);
                        c6956l2.startapp(false);
                    } else {
                        c6956l2.m2123default(-1192234821);
                        AbstractC10310l.yandex(z2, ((C9735l) c6956l2.isPro(AbstractC12502l.yandex)).yandex, AbstractC0080l.isPro(C4346l.f8873l, f), c6956l2, 0);
                        c6956l2.startapp(false);
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, (i4 & 14) | 1597440 | ((i4 >> 3) & 112), 40);
            interfaceC17242l3 = interfaceC17242l4;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؘؙؓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1497l.loadAd(z, z2, interfaceC17242l3, f, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static synchronized C4845l mopub(C4434l c4434l) {
        try {
            if (yandex == null) {
                yandex = new C5599l(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C4845l) yandex.m216l(c4434l);
    }

    public static final float purchase(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = AbstractC6290l.yandex;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : AbstractC13650l.yandex[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final void yandex(final Function0 function0, final boolean z, final boolean z2, final InterfaceC17242l interfaceC17242l, final long j, long j2, float f, C6956l c6956l, final int i) {
        final long j3;
        final float f2;
        c6956l.m2133new(-261695189);
        int i2 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | (c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024) | 1769472;
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            long j4 = C9735l.purchase;
            final float f3 = 24.0f;
            AbstractC11184l.yandex(function0, interfaceC17242l, AbstractC7497l.yandex, j, j4, new C2322l(0.0f, 0.0f, 0.0f, 0.0f), AbstractC14566l.amazon(-1305201303, new Function2() { // from class: lٗؖۧ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        AbstractC1497l.loadAd(z, z2, interfaceC17242l, f3, c6956l2, 0, 0);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, ((i2 >> 6) & 112) | (i2 & 14) | 12582912 | 27648, 64);
            j3 = j4;
            f2 = 24.0f;
        } else {
            c6956l.m2124else();
            j3 = j2;
            f2 = f;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, z2, interfaceC17242l, j, j3, f2, i) { // from class: lًٖۧ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f31829l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ float f31830l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f31831l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ long f31833l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f31834l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ long f31835l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(24577);
                    AbstractC1497l.yandex(this.f31832l, this.f31831l, this.f31829l, this.f31834l, this.f31833l, this.f31835l, this.f31830l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
