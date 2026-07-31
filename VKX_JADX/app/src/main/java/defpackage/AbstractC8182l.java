package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٟۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8182l {
    public static final C15578l yandex = new C15578l(587943213, false, new C10721l(22));
    public static final C15578l loadAd = new C15578l(-1225493456, false, new C11891l(13));

    /* JADX WARN: Code duplicated, block: B:120:0x0294 A[PHI: r14 r15
  0x0294: PHI (r14v6 java.util.List) = (r14v5 java.util.List), (r14v7 java.util.List) binds: [B:106:0x024b, B:119:0x0292] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:106:0x024b, B:119:0x0292] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0298 A[LOOP:3: B:105:0x023d->B:122:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:194:0x03df  */
    /* JADX WARN: Code duplicated, block: B:197:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ed A[LOOP:5: B:198:0x03eb->B:199:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0433  */
    /* JADX WARN: Code duplicated, block: B:213:0x044b  */
    /* JADX WARN: Code duplicated, block: B:237:0x02a0 A[EDGE_INSN: B:237:0x02a0->B:124:0x02a0 BREAK  A[LOOP:3: B:105:0x023d->B:122:0x0298], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:199:0x03ed, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    public static final void amazon(ViewStructure viewStructure, C3654l c3654l, AutofillId autofillId, String str, C0151l c0151l) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        C12791l c12791l;
        C3625l c3625l;
        C5828l c5828l;
        EnumC13846l enumC13846l;
        C6402l c6402l;
        boolean z;
        InterfaceC6348l interfaceC6348l;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        String strAdmob;
        int size;
        String str2;
        String[] strArr;
        String[] strArr2;
        C13660l c13660l;
        int i;
        int i2;
        int i3;
        C13660l c13660l2;
        boolean z6;
        C12791l c12791l2;
        EnumC13846l enumC13846l2;
        C3625l c3625l2;
        C5828l c5828l2;
        C6402l c6402l2;
        boolean z7;
        C4707l c4707l = AbstractC0424l.yandex;
        C4707l c4707l2 = AbstractC16601l.yandex;
        C6264l c6264lAdvert = c3654l.advert();
        boolean z8 = true;
        if (c6264lAdvert == null || (c13660l2 = c6264lAdvert.f13225l) == null) {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            c12791l = null;
            c3625l = null;
            c5828l = null;
            enumC13846l = null;
            c6402l = null;
            z = false;
            interfaceC6348l = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        } else {
            j = 128;
            Object[] objArr = c13660l2.loadAd;
            Object[] objArr2 = c13660l2.crashlytics;
            long[] jArr = c13660l2.yandex;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i4 = 0;
                c12791l2 = null;
                z = false;
                enumC13846l2 = null;
                c3625l2 = null;
                c5828l2 = null;
                interfaceC6348l = null;
                bool = null;
                c6402l2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i4];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj2 = objArr[i7];
                                Object obj3 = objArr2[i7];
                                C4707l c4707l3 = (C4707l) obj2;
                                if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.subscription)) {
                                    c12791l2 = (C12791l) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.yandex)) {
                                    String str3 = (String) AbstractC16901l.m4217extends((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.ads)) {
                                    interfaceC6348l = (InterfaceC6348l) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.tapsense)) {
                                    c5828l2 = (C5828l) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.f1545package)) {
                                    c3625l2 = (C3625l) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.smaato)) {
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.f1539case)) {
                                    num = (Integer) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.f1543for)) {
                                    z2 = z8;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.metrica)) {
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.isVip)) {
                                    c6402l2 = (C6402l) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.f1544native)) {
                                    bool = (Boolean) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC0424l.f1546private)) {
                                    enumC13846l2 = (EnumC13846l) obj3;
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC16601l.loadAd)) {
                                    viewStructure.setClickable(z8);
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC16601l.crashlytics)) {
                                    viewStructure.setLongClickable(z8);
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC16601l.pro)) {
                                    viewStructure.setFocusable(z8);
                                } else if (AbstractC8576l.yandex(c4707l3, AbstractC16601l.firebase)) {
                                    z = z8;
                                }
                                z7 = z8;
                                if (Build.VERSION.SDK_INT >= 34 && AbstractC8576l.yandex(c4707l3, AbstractC1940l.crashlytics)) {
                                    obj = obj3;
                                }
                            } else {
                                z7 = z8;
                            }
                            j4 >>= 8;
                            i6++;
                            z8 = z7;
                        }
                        z6 = z8;
                        z6 = z6;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        z6 = z8 ? 1 : 0;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    z8 = z6 ? 1 : 0;
                }
            } else {
                z6 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                c12791l2 = null;
                z = false;
                enumC13846l2 = null;
                c3625l2 = null;
                c5828l2 = null;
                interfaceC6348l = null;
                bool = null;
                c6402l2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            Unit unit2 = Unit.INSTANCE;
            c12791l = c12791l2;
            enumC13846l = enumC13846l2;
            c3625l = c3625l2;
            c5828l = c5828l2;
            c6402l = c6402l2;
            r38 = z6;
        }
        C6264l c6264lAdvert2 = c3654l.advert();
        if (c6264lAdvert2 != null && c6264lAdvert2.f13223l && !c6264lAdvert2.f13226l) {
            c6264lAdvert2 = c6264lAdvert2.billing();
            C12463l c12463l = new C12463l(((C17893l) ((C4588l) c3654l.metrica()).f9321l).f34846l);
            c12463l.crashlytics(c3654l.metrica());
            while (c12463l.firebase()) {
                C3654l c3654l2 = (C3654l) c12463l.remoteconfig(c12463l.loadAd - 1);
                C6264l c6264lAdvert3 = c3654l2.advert();
                if (c6264lAdvert3 != null && !c6264lAdvert3.f13223l) {
                    c6264lAdvert2.admob(c6264lAdvert3);
                    if (!c6264lAdvert3.f13226l) {
                        c12463l.crashlytics(c3654l2.metrica());
                    }
                }
            }
        }
        if (c6264lAdvert2 == null || (c13660l = c6264lAdvert2.f13225l) == null) {
            list = null;
        } else {
            Object[] objArr3 = c13660l.loadAd;
            Object[] objArr4 = c13660l.crashlytics;
            long[] jArr2 = c13660l.yandex;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 8;
                list = null;
                int i9 = 0;
                while (true) {
                    long j5 = jArr2[i9];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) == j3) {
                        i = i9;
                        if (i != length2) {
                            break;
                            break;
                        } else {
                            i9 = i + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j5 & j2) < j) {
                                int i12 = (i9 << 3) + i11;
                                Object obj4 = objArr5[i12];
                                Object obj5 = objArr4[i12];
                                i3 = i8;
                                C4707l c4707l4 = (C4707l) obj4;
                                i2 = i11;
                                if (AbstractC8576l.yandex(c4707l4, AbstractC0424l.isPro)) {
                                    viewStructure.setEnabled(false);
                                } else if (AbstractC8576l.yandex(c4707l4, AbstractC0424l.applovin)) {
                                    list = (List) obj5;
                                }
                            } else {
                                i2 = i11;
                                i3 = i8;
                            }
                            j5 >>= i3;
                            i11 = i2 + 1;
                            i8 = i3;
                        }
                        if (i10 != i8) {
                            break;
                        }
                        i = i9;
                        if (i != length2) {
                            break;
                        }
                        i9 = i + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
            Unit unit3 = Unit.INSTANCE;
        }
        Integer numValueOf2 = Integer.valueOf(c3654l.f7685l);
        if (c3654l.license() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        AbstractC5941l.m1885else(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (c12791l != null) {
            numValueOf = Integer.valueOf(c12791l.yandex);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = enumC13846l != null ? 2 : null;
        }
        if (numValueOf != null) {
            AbstractC5941l.m1879case(viewStructure, numValueOf.intValue());
            Unit unit4 = Unit.INSTANCE;
        }
        if (c3625l != null) {
            AbstractC5941l.m1907switch(viewStructure, AbstractC5941l.isVip(c3625l.f7563l));
            Unit unit5 = Unit.INSTANCE;
        }
        if (c5828l != null) {
            AbstractC5941l.m1907switch(viewStructure, c5828l.yandex);
            Unit unit6 = Unit.INSTANCE;
        }
        if (interfaceC6348l != null && (strArr2 = (String[]) ((C15180l) interfaceC6348l).loadAd.toArray(new String[0])) != null) {
            AbstractC5941l.m1880catch(viewStructure, strArr2);
            Unit unit7 = Unit.INSTANCE;
        }
        C3654l c3654l3 = (C3654l) c0151l.yandex.loadAd(c3654l.f7685l);
        if (c3654l3 != null && c3654l3.f7674l != -4) {
            C13698l c13698l = c0151l.crashlytics;
            int iPurchase = c0151l.purchase(c3654l3);
            long[] jArr4 = (long[]) c13698l.f26743l;
            long j6 = jArr4[iPurchase];
            long j7 = jArr4[iPurchase + 1];
            int i13 = (int) (j6 >> 32);
            int i14 = (int) j6;
            viewStructure.setDimens(i13, i14, 0, 0, ((int) (j7 >> 32)) - i13, ((int) j7) - i14);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
            Unit unit8 = Unit.INSTANCE;
        }
        if (enumC13846l != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(enumC13846l == EnumC13846l.f27083l);
        } else if (bool != null && (c6402l == null || c6402l.yandex != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        InterfaceC6348l.yandex.getClass();
        String str4 = (String) AbstractC8669l.m2409native((String[]) C2056l.crashlytics.loadAd.toArray(new String[0]));
        if (interfaceC6348l != null && (strArr = (String[]) ((C15180l) interfaceC6348l).loadAd.toArray(new String[0])) != null) {
            boolean zSubscription = AbstractC8669l.subscription(str4, strArr);
            z3 = true;
            boolean z9 = zSubscription;
            if (!z2 || z9) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (!z4 || zBooleanValue) {
                z5 = z3;
            } else {
                z5 = false;
            }
            AbstractC5941l.m1894interface(viewStructure, z5);
            viewStructure.setVisibility(((AbstractC18026l) c3654l.f7703l.purchase).m4464l() ? 4 : 0);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (int i15 = 0; i15 < size; i15++) {
                    str2 = ((Object) str2) + ((C3625l) list.get(i15)).f7563l + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
                Unit unit9 = Unit.INSTANCE;
            }
            if (((C4588l) c3654l.metrica()).isEmpty() && c6402l != null && (strAdmob = AbstractC4603l.admob(c6402l.yandex)) != null) {
                viewStructure.setClassName(strAdmob);
                Unit unit10 = Unit.INSTANCE;
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    AbstractC13950l.m3817new(viewStructure, num.intValue());
                    Unit unit11 = Unit.INSTANCE;
                }
                if (z4) {
                    AbstractC5941l.m1906super(viewStructure);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            C18725l.loadAd();
            return;
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        AbstractC5941l.m1894interface(viewStructure, z5);
        viewStructure.setVisibility(((AbstractC18026l) c3654l.f7703l.purchase).m4464l() ? 4 : 0);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i15 < size) {
                str2 = ((Object) str2) + ((C3625l) list.get(i15)).f7563l + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
            Unit unit12 = Unit.INSTANCE;
        }
        if (((C4588l) c3654l.metrica()).isEmpty()) {
            viewStructure.setClassName(strAdmob);
            Unit unit13 = Unit.INSTANCE;
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC13950l.m3817new(viewStructure, num.intValue());
                Unit unit14 = Unit.INSTANCE;
            }
            if (z4) {
                AbstractC5941l.m1906super(viewStructure);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final void billing(C6956l c6956l, Object obj, Function2 function2) {
        if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), obj)) {
            c6956l.m2147try(obj);
            c6956l.loadAd(obj, function2);
        }
    }

    public static final void crashlytics(C6956l c6956l, Integer num, Function2 function2) {
        if (c6956l.f14603switch) {
            c6956l.loadAd(num, function2);
        }
    }

    public static AbstractC0085l loadAd() {
        C8688l c8688l = AbstractC0085l.yandex;
        List list = (List) c8688l.getValue();
        C8994l.yandex.getClass();
        int iIntValue = ((Number) C8994l.subs.yandex()).intValue();
        return (AbstractC0085l) ((iIntValue < 0 || iIntValue >= list.size()) ? (AbstractC0085l) ((List) c8688l.getValue()).get(0) : list.get(iIntValue));
    }

    public static final void purchase(C6956l c6956l, Function1 function1) {
        c6956l.loadAd(Unit.INSTANCE, new C18039l(function1));
    }

    public static Object yandex(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
