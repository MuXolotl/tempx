package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C13637l implements InterfaceC18035l, InterfaceC16555l {
    public Map admob;
    public int amazon = -1;
    public final List[] billing;
    public final int crashlytics;
    public final InterfaceC1220l firebase;
    public final InterfaceC1220l isPro;
    public final InterfaceC13593l loadAd;
    public final boolean[] mopub;
    public final String[] purchase;
    public final InterfaceC1220l subs;
    public final String yandex;

    public C13637l(String str, InterfaceC13593l interfaceC13593l, int i) {
        this.yandex = str;
        this.loadAd = interfaceC13593l;
        this.crashlytics = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.purchase = strArr;
        int i4 = this.crashlytics;
        this.billing = new List[i4];
        this.mopub = new boolean[i4];
        this.admob = C14054l.f27396l;
        Function0 function0 = new Function0(this) { // from class: lًؔۚ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13637l f16287l;

            {
                this.f16287l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                int i5 = i2;
                C13637l c13637l = this.f16287l;
                switch (i5) {
                    case 0:
                        InterfaceC13593l interfaceC13593l2 = c13637l.loadAd;
                        return interfaceC13593l2 != null ? interfaceC13593l2.amazon() : AbstractC3872l.yandex;
                    case 1:
                        InterfaceC13593l interfaceC13593l3 = c13637l.loadAd;
                        if (interfaceC13593l3 != null) {
                            InterfaceC16588l[] interfaceC16588lArrYandex = interfaceC13593l3.yandex();
                            arrayList = new ArrayList(interfaceC16588lArrYandex.length);
                            for (InterfaceC16588l interfaceC16588l : interfaceC16588lArrYandex) {
                                arrayList.add(interfaceC16588l.purchase());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC16164l.purchase(arrayList);
                    default:
                        return Integer.valueOf(AbstractC3670l.crashlytics(c13637l, (InterfaceC18035l[]) c13637l.isPro.getValue()));
                }
            }
        };
        final int i5 = 2;
        this.subs = AbstractC9968l.crashlytics(2, function0);
        final int i6 = 1;
        this.isPro = AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lًؔۚ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13637l f16287l;

            {
                this.f16287l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                int i7 = i6;
                C13637l c13637l = this.f16287l;
                switch (i7) {
                    case 0:
                        InterfaceC13593l interfaceC13593l2 = c13637l.loadAd;
                        return interfaceC13593l2 != null ? interfaceC13593l2.amazon() : AbstractC3872l.yandex;
                    case 1:
                        InterfaceC13593l interfaceC13593l3 = c13637l.loadAd;
                        if (interfaceC13593l3 != null) {
                            InterfaceC16588l[] interfaceC16588lArrYandex = interfaceC13593l3.yandex();
                            arrayList = new ArrayList(interfaceC16588lArrYandex.length);
                            for (InterfaceC16588l interfaceC16588l : interfaceC16588lArrYandex) {
                                arrayList.add(interfaceC16588l.purchase());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC16164l.purchase(arrayList);
                    default:
                        return Integer.valueOf(AbstractC3670l.crashlytics(c13637l, (InterfaceC18035l[]) c13637l.isPro.getValue()));
                }
            }
        });
        this.firebase = AbstractC9968l.crashlytics(2, new Function0(this) { // from class: lًؔۚ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13637l f16287l;

            {
                this.f16287l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                int i7 = i5;
                C13637l c13637l = this.f16287l;
                switch (i7) {
                    case 0:
                        InterfaceC13593l interfaceC13593l2 = c13637l.loadAd;
                        return interfaceC13593l2 != null ? interfaceC13593l2.amazon() : AbstractC3872l.yandex;
                    case 1:
                        InterfaceC13593l interfaceC13593l3 = c13637l.loadAd;
                        if (interfaceC13593l3 != null) {
                            InterfaceC16588l[] interfaceC16588lArrYandex = interfaceC13593l3.yandex();
                            arrayList = new ArrayList(interfaceC16588lArrYandex.length);
                            for (InterfaceC16588l interfaceC16588l : interfaceC16588lArrYandex) {
                                arrayList.add(interfaceC16588l.purchase());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC16164l.purchase(arrayList);
                    default:
                        return Integer.valueOf(AbstractC3670l.crashlytics(c13637l, (InterfaceC18035l[]) c13637l.isPro.getValue()));
                }
            }
        });
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return this.purchase[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        Integer num = (Integer) this.admob.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.InterfaceC18035l
    public AbstractC2021l billing() {
        return C16015l.amazon;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13637l) {
            InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj;
            if (this.yandex.equals(interfaceC18035l.yandex()) && Arrays.equals((InterfaceC18035l[]) this.isPro.getValue(), (InterfaceC18035l[]) ((C13637l) obj).isPro.getValue())) {
                int iMopub = interfaceC18035l.mopub();
                int i = this.crashlytics;
                if (i == iMopub) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC8576l.yandex(isPro(i2).yandex(), interfaceC18035l.isPro(i2).yandex()) && AbstractC8576l.yandex(isPro(i2).billing(), interfaceC18035l.isPro(i2).billing())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        return this.mopub[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final List getAnnotations() {
        return C2580l.f5619l;
    }

    public int hashCode() {
        return ((Number) this.firebase.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC18035l
    public InterfaceC18035l isPro(int i) {
        return ((InterfaceC16588l[]) this.subs.getValue())[i].purchase();
    }

    @Override // defpackage.InterfaceC16555l
    public final Set loadAd() {
        return this.admob.keySet();
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC18035l
    public /* bridge */ boolean purchase() {
        return false;
    }

    public final void smaato(String str, boolean z) {
        int i = this.amazon + 1;
        this.amazon = i;
        String[] strArr = this.purchase;
        strArr[i] = str;
        this.mopub[i] = z;
        this.billing[i] = null;
        if (i == this.crashlytics - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.admob = map;
        }
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        List list = this.billing[i];
        return list == null ? C2580l.f5619l : list;
    }

    public String toString() {
        return AbstractC3670l.billing(this);
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return this.yandex;
    }
}
