package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖۦۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4523l {
    public static final C13315l amazon;
    public static final C13315l purchase;
    public static final C0010l yandex = new C0010l(C11192l.f22542l, C11192l.f22527l);
    public static final C13315l loadAd = AbstractC0532l.admob(0.0f, 400.0f, null, 5);
    public static final C13315l crashlytics = AbstractC0532l.admob(0.0f, 400.0f, null, 5);

    static {
        C8896l c8896l = AbstractC11922l.yandex;
        amazon = AbstractC0532l.admob(0.0f, 400.0f, new C5177l(4294967297L), 1);
        purchase = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
    }

    public static final C0274l admob(InterfaceC13460l interfaceC13460l, InterfaceC17807l interfaceC17807l, Function1 function1) {
        return new C0274l(new C3313l((C4610l) null, (C5487l) null, new C15457l(interfaceC13460l, interfaceC17807l, function1), (C11700l) null, (LinkedHashMap) null, 123));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C3000l amazon(C4776l c4776l, int i) {
        C14855l c14855l;
        InterfaceC17807l interfaceC17807lAdmob = c4776l;
        if ((i & 1) != 0) {
            C8896l c8896l = AbstractC11922l.yandex;
            interfaceC17807lAdmob = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
        }
        C0086l c0086l = C18450l.f36016l;
        if (c0086l.equals(C18450l.f36044l)) {
            c14855l = C18450l.f36017l;
        } else {
            c14855l = c0086l.equals(c0086l) ? C18450l.f36042l : C18450l.f36043l;
        }
        return crashlytics(c14855l, interfaceC17807lAdmob, new C11177l(1, 6));
    }

    public static C0274l billing(InterfaceC17807l interfaceC17807l, int i) {
        if ((i & 1) != 0) {
            interfaceC17807l = AbstractC0532l.admob(0.0f, 400.0f, null, 5);
        }
        return new C0274l(new C3313l(new C4610l(interfaceC17807l), (C5487l) null, (C15457l) null, (C11700l) null, (LinkedHashMap) null, 126));
    }

    public static final C3000l crashlytics(InterfaceC13460l interfaceC13460l, InterfaceC17807l interfaceC17807l, Function1 function1) {
        return new C3000l(new C3313l((C4610l) null, (C5487l) null, new C15457l(interfaceC13460l, interfaceC17807l, function1), (C11700l) null, (LinkedHashMap) null, 123));
    }

    public static C3000l loadAd(InterfaceC17807l interfaceC17807l, C15089l c15089l, int i) {
        C14855l c14855l;
        C15089l c15089l2 = C18450l.f36023l;
        if ((i & 1) != 0) {
            C8896l c8896l = AbstractC11922l.yandex;
            interfaceC17807l = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            c15089l = c15089l2;
        }
        if (AbstractC8576l.yandex(c15089l, C18450l.f36046l)) {
            c14855l = C18450l.f36035l;
        } else {
            c14855l = AbstractC8576l.yandex(c15089l, c15089l2) ? C18450l.f36018l : C18450l.f36043l;
        }
        return crashlytics(c14855l, interfaceC17807l, new C11177l(1, 5));
    }

    public static C0274l mopub(InterfaceC17807l interfaceC17807l, C15089l c15089l, int i) {
        C14855l c14855l;
        C15089l c15089l2 = C18450l.f36023l;
        if ((i & 1) != 0) {
            C8896l c8896l = AbstractC11922l.yandex;
            interfaceC17807l = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            c15089l = c15089l2;
        }
        if (AbstractC8576l.yandex(c15089l, C18450l.f36046l)) {
            c14855l = C18450l.f36035l;
        } else {
            c14855l = AbstractC8576l.yandex(c15089l, c15089l2) ? C18450l.f36018l : C18450l.f36043l;
        }
        return admob(c14855l, interfaceC17807l, new C11177l(1, 7));
    }

    public static C3000l purchase(InterfaceC17807l interfaceC17807l, int i) {
        if ((i & 1) != 0) {
            interfaceC17807l = AbstractC0532l.admob(0.0f, 400.0f, null, 5);
        }
        return new C3000l(new C3313l(new C4610l(interfaceC17807l), (C5487l) null, (C15457l) null, (C11700l) null, (LinkedHashMap) null, 126));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C0274l subs(C4776l c4776l, int i) {
        C14855l c14855l;
        InterfaceC17807l interfaceC17807lAdmob = c4776l;
        if ((i & 1) != 0) {
            C8896l c8896l = AbstractC11922l.yandex;
            interfaceC17807lAdmob = AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
        }
        C0086l c0086l = C18450l.f36016l;
        if (c0086l.equals(C18450l.f36044l)) {
            c14855l = C18450l.f36017l;
        } else {
            c14855l = c0086l.equals(c0086l) ? C18450l.f36042l : C18450l.f36043l;
        }
        return admob(c14855l, interfaceC17807lAdmob, new C11177l(1, 8));
    }

    public static final void yandex(C18656l c18656l, Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(-1186853286);
        int i2 = (c6956l.billing(c18656l) ? 4 : 2) | i | (c6956l.admob(function0) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C10086l c10086l = c18656l.purchase;
            C10086l c10086l2 = c18656l.amazon;
            boolean z = c10086l.getValue() != null;
            if (AbstractC8576l.yandex(c18656l.crashlytics(), c10086l2.getValue()) && !z) {
                function0.invoke();
            }
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            Object obj = objM2132native;
            if (objM2132native == c13863l) {
                boolean[] zArr = {z};
                c6956l.m2147try(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new Object[1];
                c6956l.m2147try(objM2132native2);
            }
            Object[] objArr = (Object[]) objM2132native2;
            if (!AbstractC8576l.yandex(objArr[0], c10086l2.getValue())) {
                if (!z && !zArr2[0]) {
                    function0.invoke();
                }
                objArr[0] = c10086l2.getValue();
            }
            zArr2[0] = z;
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17671l(c18656l, function0, i);
        }
    }
}
