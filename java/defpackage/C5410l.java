package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5410l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f11597l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11598l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11599l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f11600l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11601l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f11602l;

    public /* synthetic */ C5410l(C9568l c9568l, ArrayList arrayList, boolean z, long j, C17385l c17385l) {
        this.f11601l = c9568l;
        this.f11600l = arrayList;
        this.f11598l = z;
        this.f11597l = j;
        this.f11602l = c17385l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11599l;
        Object obj2 = this.f11602l;
        Object obj3 = this.f11600l;
        Object obj4 = this.f11601l;
        switch (i) {
            case 0:
                final ArrayList arrayList = (ArrayList) obj3;
                final C17385l c17385l = (C17385l) obj2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                final boolean z = this.f11598l;
                final long j = this.f11597l;
                Function1 function1 = new Function1() { // from class: lِۢ٘
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        C11925l c11925l;
                        int i2;
                        int i3;
                        AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj5;
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            C15724l c15724l = (C15724l) arrayList2.get(i4);
                            boolean zMo992import = c17385l.f33850l.mo992import();
                            boolean z2 = c15724l.amazon;
                            if (c15724l.ads == Integer.MIN_VALUE) {
                                AbstractC14825l.yandex("position() should be called first");
                            }
                            List list = c15724l.crashlytics;
                            int size2 = list.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i5);
                                int i6 = c15724l.subscription - (z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l);
                                int i7 = c15724l.tapsense;
                                int i8 = i4;
                                long j2 = c15724l.pro;
                                ArrayList arrayList3 = arrayList2;
                                int i9 = size;
                                C7136l c7136lYandex = c15724l.isPro.yandex(i5, c15724l.loadAd);
                                if (c7136lYandex != null) {
                                    if (zMo992import) {
                                        c7136lYandex.vip = j2;
                                    } else {
                                        long jAmazon = C5177l.amazon(!C5177l.loadAd(c7136lYandex.vip, 9223372034707292159L) ? c7136lYandex.vip : j2, ((C5177l) c7136lYandex.ads.getValue()).yandex);
                                        if ((c15724l.yandex(j2) <= i6 && c15724l.yandex(jAmazon) <= i6) || (c15724l.yandex(j2) >= i7 && c15724l.yandex(jAmazon) >= i7)) {
                                            c7136lYandex.loadAd();
                                        }
                                        j2 = jAmazon;
                                    }
                                    c11925l = c7136lYandex.metrica;
                                } else {
                                    zMo992import = zMo992import;
                                    z2 = z2;
                                    list = list;
                                    size2 = size2;
                                    c11925l = null;
                                }
                                if (z) {
                                    if (z2) {
                                        i2 = (int) (j2 >> 32);
                                    } else {
                                        i2 = (c15724l.ads - ((int) (j2 >> 32))) - (z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l);
                                    }
                                    if (z2) {
                                        i3 = (c15724l.ads - ((int) (j2 & 4294967295L))) - (z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l);
                                    } else {
                                        i3 = (int) (j2 & 4294967295L);
                                    }
                                    j2 = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                                }
                                long jAmazon2 = C5177l.amazon(j2, j);
                                if (!zMo992import && c7136lYandex != null) {
                                    c7136lYandex.remoteconfig = jAmazon2;
                                }
                                if (c11925l != null) {
                                    AbstractC9601l.metrica(abstractC9601l2, abstractC10113l, jAmazon2, c11925l);
                                } else {
                                    AbstractC9601l.vip(abstractC9601l2, abstractC10113l, jAmazon2);
                                }
                                i5++;
                                zMo992import = zMo992import;
                                i4 = i8;
                                arrayList2 = arrayList3;
                                size = i9;
                                z2 = z2;
                                list = list;
                                size2 = size2;
                            }
                            i4++;
                        }
                        return Unit.INSTANCE;
                    }
                };
                abstractC9601l.f19562l = true;
                function1.invoke(abstractC9601l);
                abstractC9601l.f19562l = false;
                ((C9568l) obj4).yandex.Signature.getValue();
                break;
            default:
                Boolean boolValueOf = Boolean.valueOf(this.f11598l);
                C12814l c12814l = new C12814l(this.f11597l);
                AbstractC13082l.loadAd.invoke((Context) obj4, (ResolveInfo) obj3, boolValueOf, (CharSequence) obj2, c12814l);
                ((InterfaceC5912l) obj).close();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5410l(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j) {
        this.f11601l = context;
        this.f11600l = resolveInfo;
        this.f11598l = z;
        this.f11602l = charSequence;
        this.f11597l = j;
    }
}
