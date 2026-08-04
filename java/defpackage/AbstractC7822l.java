package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًؘۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7822l implements InterfaceC0983l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C15578l f16346l = new C15578l(-564535719, false, new C5974l(7));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15578l f16345l = new C15578l(-1096466280, false, new C5974l(8));

    public static final int admob(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] billing(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC8669l.signatures(0, i, 6, objArr, objArr2);
        AbstractC8669l.pro(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] crashlytics(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC8669l.signatures(0, i, 6, objArr, objArr2);
        AbstractC8669l.pro(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] mopub(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC8669l.signatures(0, i, 6, objArr, objArr2);
        AbstractC8669l.pro(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final long smaato(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static InterfaceC7697l subs(C14329l c14329l, String str, InterfaceC7697l interfaceC7697l) throws C13031l, IOException {
        String string;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListMetrica = AbstractC14055l.metrica(new C16861l(interfaceC7697l, c14329l, 0));
        while (true) {
            C16861l c16861l = (C16861l) AbstractC3984l.signatures(arrayListMetrica);
            if (c16861l != null) {
                InterfaceC7697l interfaceC7697l2 = (InterfaceC7697l) ((InterfaceC7697l) c16861l.yandex).yandex();
                int iIntValue = c16861l.crashlytics;
                C14329l c14329l2 = c16861l.loadAd;
                List list = c14329l2.yandex;
                List list2 = c14329l2.loadAd;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        if (!list2.isEmpty()) {
                            int size2 = list2.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i2 = size2 - 1;
                                arrayListMetrica.add(new C16861l(interfaceC7697l2, (C14329l) list2.get(size2), iIntValue));
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        } else {
                            if (iIntValue != str.length()) {
                                arrayList.add(new C0876l(iIntValue, C15152l.f29727l));
                                break;
                            }
                            return interfaceC7697l2;
                        }
                    } else {
                        Object objYandex = ((InterfaceC6097l) c14329l2.yandex.get(i)).yandex(interfaceC7697l2, str, iIntValue);
                        if (!(objYandex instanceof Integer)) {
                            if (objYandex instanceof C0876l) {
                                arrayList.add((C0876l) objYandex);
                                break;
                            }
                            C17132l.metrica(objYandex, "Unexpected parse result: ");
                            return null;
                        }
                        iIntValue = ((Number) objYandex).intValue();
                        i++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    AbstractC3826l.Signature(new C15696l(8), arrayList);
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((C0876l) arrayList.get(0)).yandex + ": " + ((String) ((C0876l) arrayList.get(0)).loadAd.invoke());
                } else {
                    StringBuilder sb = new StringBuilder(arrayList.size() * 33);
                    AbstractC16901l.m4216else(arrayList, sb, ", ", "Errors: ", null, new C1306l(29), 56);
                    string = sb.toString();
                }
                throw new C13031l(string);
            }
        }
    }

    @Override // defpackage.InterfaceC0983l
    public int amazon(int i) {
        return firebase(i);
    }

    public abstract int firebase(int i);

    public abstract int isPro(int i);

    @Override // defpackage.InterfaceC0983l
    public int loadAd(int i) {
        int iFirebase = firebase(i);
        if (iFirebase == -1 || firebase(iFirebase) == -1) {
            return -1;
        }
        return iFirebase;
    }

    @Override // defpackage.InterfaceC0983l
    public int purchase(int i) {
        return isPro(i);
    }

    @Override // defpackage.InterfaceC0983l
    public int yandex(int i) {
        int iIsPro = isPro(i);
        if (iIsPro == -1 || isPro(iIsPro) == -1) {
            return -1;
        }
        return iIsPro;
    }
}
