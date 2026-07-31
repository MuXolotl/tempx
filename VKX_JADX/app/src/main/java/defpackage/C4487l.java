package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4487l {
    public final C11362l crashlytics;
    public C3625l loadAd;
    public final C10086l yandex = AbstractC8020l.smaato(null);

    public C4487l(C3625l c3625l) {
        C5562l c5562l = new C5562l(17);
        c3625l.getClass();
        C18734l c18734l = new C18734l(c3625l);
        ArrayList arrayList = c18734l.f36516l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) c5562l.invoke(((C4253l) arrayList.get(i)).yandex(RecyclerView.UNDEFINED_DURATION));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C15012l c15012l = (C15012l) list.get(i2);
                arrayList3.add(new C4253l(c15012l.loadAd, c15012l.crashlytics, c15012l.yandex, c15012l.amazon));
            }
            AbstractC3984l.license(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.loadAd = c18734l.billing();
        this.crashlytics = new C11362l();
    }

    public static C15012l crashlytics(C15012l c15012l, C0327l c0327l) {
        C6222l c6222l = c0327l.loadAd;
        int iCrashlytics = c6222l.crashlytics(c6222l.billing - 1, false);
        if (c15012l.loadAd < iCrashlytics) {
            return C15012l.yandex(c15012l, null, 0, Math.min(c15012l.crashlytics, iCrashlytics), 11);
        }
        return null;
    }

    public final void loadAd(Object[] objArr, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(-2083052099);
        int i2 = (i & 48) == 0 ? (c6956l.admob(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        c6956l.m2121class(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (c6956l.amazon(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= c6956l.admob(obj) ? 4 : 0;
        }
        c6956l.startapp(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C4384l c4384l = new C4384l(2);
            c4384l.loadAd(function1);
            c4384l.crashlytics(objArr);
            ArrayList arrayList = c4384l.yandex;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zAdmob = c6956l.admob(this) | ((i3 & 112) == 32);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C3883l(this, function1, i4);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.crashlytics(array, (Function1) objM2132native, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, objArr, function1, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yandex(C6956l c6956l, int i) {
        int i2;
        char c;
        boolean z;
        char c2;
        c6956l.m2133new(1154651354);
        char c3 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C18196l c18196l = (C18196l) c6956l.isPro(AbstractC4751l.subscription);
            C3625l c3625l = this.loadAd;
            List listYandex = c3625l.yandex(c3625l.f7563l.length());
            int size = listYandex.size();
            int i4 = 0;
            while (i4 < size) {
                C15012l c15012l = (C15012l) listYandex.get(i4);
                int i5 = c15012l.loadAd;
                Object obj = c15012l.yandex;
                if (i5 != c15012l.crashlytics) {
                    c6956l.m2123default(725478935);
                    Object objM2132native = c6956l.m2132native();
                    Object obj2 = C1867l.yandex;
                    if (objM2132native == obj2) {
                        objM2132native = AbstractC14814l.isPro(c6956l);
                    }
                    C2403l c2403l = (C2403l) objM2132native;
                    c = c3;
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(C4346l.f8873l, new C10207l(this, c15012l, 24));
                    Object objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj2) {
                        c2 = 1;
                        objM2132native2 = new C5562l(18);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        c2 = 1;
                    }
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC1135l.amazon(AbstractC4962l.yandex(interfaceC17242lLoadAd, z2, (Function1) objM2132native2).premium(new C13336l(new C15263l(this, c15012l, 22))), c2403l);
                    InterfaceC11325l.yandex.getClass();
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC15269l.crashlytics(interfaceC17242lAmazon, AbstractC4047l.crashlytics);
                    boolean zAdmob = c6956l.admob(this) | c6956l.billing(c15012l) | c6956l.admob(c18196l);
                    Object objM2132native3 = c6956l.m2132native();
                    if (zAdmob || objM2132native3 == obj2) {
                        objM2132native3 = new C5514l(this, c15012l, c18196l);
                        c6956l.m2147try(objM2132native3);
                    }
                    AbstractC9383l.yandex(AbstractC9151l.crashlytics(interfaceC17242lCrashlytics, c2403l, null, false, null, (Function0) objM2132native3, 508), c6956l, 0);
                    AbstractC12494l abstractC12494l = (AbstractC12494l) obj;
                    C11244l c11244lLoadAd = abstractC12494l.loadAd();
                    if (c11244lLoadAd == null || (c11244lLoadAd.yandex == null && c11244lLoadAd.loadAd == null && c11244lLoadAd.crashlytics == null && c11244lLoadAd.amazon == null)) {
                        i2 = i3;
                        z = false;
                        c6956l.m2123default(728331710);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(726303039);
                        Object objM2132native4 = c6956l.m2132native();
                        if (objM2132native4 == obj2) {
                            objM2132native4 = new C15806l(c2403l);
                            c6956l.m2147try(objM2132native4);
                        }
                        C15806l c15806l = (C15806l) objM2132native4;
                        Unit unit = Unit.INSTANCE;
                        Object objM2132native5 = c6956l.m2132native();
                        InterfaceC14029l interfaceC14029l = null;
                        if (objM2132native5 == obj2) {
                            objM2132native5 = new C17972l(c15806l, interfaceC14029l, 28);
                            c6956l.m2147try(objM2132native5);
                        }
                        AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native5);
                        C15308l c15308l = c15806l.loadAd;
                        C15308l c15308l2 = c15806l.loadAd;
                        Boolean boolValueOf = Boolean.valueOf((c15308l.admob() & 2) != 0 ? c2 : 0);
                        Boolean boolValueOf2 = Boolean.valueOf((c15308l2.admob() & 1) != 0 ? c2 : 0);
                        Boolean boolValueOf3 = Boolean.valueOf((c15308l2.admob() & 4) != 0 ? c2 : 0);
                        C11244l c11244lLoadAd2 = abstractC12494l.loadAd();
                        C14264l c14264l = c11244lLoadAd2 != null ? c11244lLoadAd2.yandex : null;
                        i2 = i3;
                        C11244l c11244lLoadAd3 = abstractC12494l.loadAd();
                        C14264l c14264l2 = c11244lLoadAd3 != null ? c11244lLoadAd3.loadAd : null;
                        C11244l c11244lLoadAd4 = abstractC12494l.loadAd();
                        C14264l c14264l3 = c11244lLoadAd4 != null ? c11244lLoadAd4.crashlytics : null;
                        C11244l c11244lLoadAd5 = abstractC12494l.loadAd();
                        C14264l c14264l4 = c11244lLoadAd5 != null ? c11244lLoadAd5.amazon : null;
                        C14264l c14264l5 = c14264l3;
                        Object[] objArr = new Object[7];
                        objArr[0] = boolValueOf;
                        objArr[c2] = boolValueOf2;
                        objArr[c] = boolValueOf3;
                        objArr[3] = c14264l;
                        objArr[4] = c14264l2;
                        objArr[5] = c14264l5;
                        objArr[6] = c14264l4;
                        boolean zAdmob2 = c6956l.admob(this) | c6956l.billing(c15012l);
                        Object objM2132native6 = c6956l.m2132native();
                        if (zAdmob2 || objM2132native6 == obj2) {
                            objM2132native6 = new C10207l(this, c15012l, c15806l);
                            c6956l.m2147try(objM2132native6);
                        }
                        loadAd(objArr, (Function1) objM2132native6, c6956l, (i2 << 6) & 896);
                        z = false;
                        c6956l.startapp(false);
                    }
                    c6956l.startapp(z);
                } else {
                    i2 = i3;
                    c = c3;
                    z = z2;
                    c6956l.m2123default(728345598);
                    c6956l.startapp(z);
                }
                i4++;
                z2 = z;
                i3 = i2;
                c3 = c;
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, 25);
        }
    }
}
