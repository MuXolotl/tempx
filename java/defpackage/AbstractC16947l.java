package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16947l {
    public static final C15578l yandex = new C15578l(-210781411, false, new C8337l(25));

    public static Rational amazon(int i, Rational rational) {
        if (i == 90 || i == 270) {
            return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    /* JADX WARN: Code duplicated, block: B:9:0x000c A[PHI: r1
  0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static C4812l billing(int i) {
        int i2 = 6;
        if (i != 0) {
            int i3 = 1;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = i3;
            } else {
                i3 = 5;
                if (i == 3) {
                    i2 = i3;
                } else if (i == 4) {
                    i2 = 3;
                } else if (i != 5) {
                    if (i == 6) {
                        i2 = 2;
                    } else {
                        i3 = 7;
                        if (i != 7 && i != 8) {
                            if (i == 9) {
                                i2 = 4;
                            } else if (i == 10) {
                                i2 = i3;
                            } else if (i != 11 && i != 12 && i != 13) {
                                C18262l.startapp(C6288l.yandex(i), "Unexpected CameraError: ");
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return new C4812l(i2);
    }

    public static final C4763l crashlytics(InterfaceC17477l interfaceC17477l) {
        InterfaceC17477l interfaceC17477l2;
        int i = AbstractC3759l.yandex;
        Iterator it = interfaceC17477l.ad().mo1339native().yandex().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC17477l2 = null;
                break;
            }
            AbstractC18041l abstractC18041l = (AbstractC18041l) it.next();
            if (!AbstractC16860l.ad(abstractC18041l)) {
                InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
                if (AbstractC11125l.smaato(interfaceC15234lPro, 1) || AbstractC11125l.smaato(interfaceC15234lPro, 3)) {
                    interfaceC17477l2 = (InterfaceC17477l) interfaceC15234lPro;
                    break;
                }
            }
        }
        if (interfaceC17477l2 == null) {
            return null;
        }
        InterfaceC7637l interfaceC7637lMo756new = interfaceC17477l2.mo756new();
        C4763l c4763l = interfaceC7637lMo756new instanceof C4763l ? (C4763l) interfaceC7637lMo756new : null;
        return c4763l == null ? crashlytics(interfaceC17477l2) : c4763l;
    }

    public static final ArrayList loadAd(ArrayList arrayList, List list, InterfaceC4884l interfaceC4884l) {
        AbstractC18041l abstractC18041lBilling;
        arrayList.size();
        list.size();
        ArrayList<C8195l> arrayListM4226l = AbstractC16901l.m4226l(list, arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayListM4226l, 10));
        for (C8195l c8195l : arrayListM4226l) {
            AbstractC18041l abstractC18041l = (AbstractC18041l) c8195l.f17098l;
            C17538l c17538l = (C17538l) c8195l.f17097l;
            int i = c17538l.f34146l;
            InterfaceC3841l annotations = c17538l.getAnnotations();
            C3498l name = c17538l.getName();
            boolean zM4403l = c17538l.m4403l();
            boolean z = c17538l.f34150l;
            boolean z2 = c17538l.f34148l;
            if (c17538l.f34151l != null) {
                int i2 = AbstractC3759l.yandex;
                abstractC18041lBilling = AbstractC11125l.crashlytics(interfaceC4884l).subs().billing(abstractC18041l);
            } else {
                abstractC18041lBilling = null;
            }
            arrayList2.add(new C17538l(interfaceC4884l, null, i, annotations, name, abstractC18041l, zM4403l, z, z2, abstractC18041lBilling, c17538l.billing()));
        }
        return arrayList2;
    }

    public static boolean purchase(int i) {
        return i == 6 || i == 1 || i == 2 || i == 4;
    }

    public static final void yandex(C18624l c18624l, Context context, boolean z, CharSequence charSequence, long j) {
        if (C12814l.amazon(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) AbstractC13082l.yandex.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        c18624l.yandex();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            c18624l.yandex.yandex(new C5249l(new C3922l(i), resolveInfo.loadLabel(packageManager).toString(), 0, new C5410l(context, resolveInfo, z, charSequence, j)));
        }
        c18624l.yandex();
    }
}
