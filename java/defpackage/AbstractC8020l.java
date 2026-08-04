package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8020l {
    public static final C4733l yandex = new C4733l(C15840l.class, new C18353l(25));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new C18353l(26));
    public static final C5773l crashlytics = new C5773l(C5690l.class, new C18353l(27));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new C18353l(28));
    public static final String[] purchase = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] billing = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static C7396l adcel(C9358l c9358l) throws GeneralSecurityException {
        if (c9358l == C9358l.crashlytics) {
            return C7396l.f15322l;
        }
        C9358l c9358l2 = C9358l.billing;
        C7396l c7396l = C7396l.f15324l;
        if (c9358l == c9358l2 || c9358l == C9358l.amazon) {
            return c7396l;
        }
        if (c9358l == C9358l.purchase) {
            return C7396l.f15323l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static Cfor admob(String str) {
        if (str.equals("SHA-256")) {
            return InterfaceC8134l.yandex;
        }
        if (str.equals("SHA-512")) {
            return InterfaceC8134l.crashlytics;
        }
        if (str.equals("SHAKE128")) {
            return InterfaceC8134l.firebase;
        }
        if (str.equals("SHAKE256")) {
            return InterfaceC8134l.smaato;
        }
        C8339l.metrica("unrecognized digest: ".concat(str));
        return null;
    }

    public static final C4956l amazon(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(isPro((C0861l) it.next()));
            }
            return new C4956l(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(isPro((C0861l) it2.next()));
            }
            return new C4956l(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C4956l c4956lAmazon = amazon(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(isPro((C0861l) it3.next()));
        }
        return new C4956l(cls, c4956lAmazon, arrayList3);
    }

    public static final C8610l billing(InterfaceC6642l interfaceC6642l, Function0 function0) {
        C4816l c4816l = AbstractC5929l.yandex;
        return new C8610l(interfaceC6642l, function0);
    }

    public static final Type crashlytics(InterfaceC13012l interfaceC13012l, boolean z) {
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        if (interfaceC1122lMo1616package instanceof AbstractC11726l) {
            if (!(interfaceC1122lMo1616package instanceof AbstractC11726l)) {
                return new C3345l((AbstractC11726l) interfaceC1122lMo1616package);
            }
            AbstractC11726l abstractC11726l = (AbstractC11726l) interfaceC1122lMo1616package;
            GenericDeclaration genericDeclaration = (GenericDeclaration) abstractC11726l.f23463l.getValue();
            if (genericDeclaration == null) {
                C1759l.adcel(interfaceC13012l, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : genericDeclaration.getTypeParameters()) {
                if (AbstractC8576l.yandex(typeVariable2.getName(), abstractC11726l.crashlytics())) {
                    if (z2) {
                        C8339l.metrica("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                return typeVariable;
            }
            C1759l.firebase("Array contains no element matching the predicate.");
            return null;
        }
        if (!(interfaceC1122lMo1616package instanceof InterfaceC1388l)) {
            C1759l.adcel(interfaceC13012l, "Unsupported type classifier: ");
            return null;
        }
        InterfaceC1388l interfaceC1388l = (InterfaceC1388l) interfaceC1122lMo1616package;
        Class clsMopub = z ? AbstractC16131l.mopub(interfaceC1388l) : ((InterfaceC13937l) interfaceC1388l).mo1730private();
        List listMo1617throws = interfaceC13012l.mo1617throws();
        if (listMo1617throws.isEmpty()) {
            return clsMopub;
        }
        if (!clsMopub.isArray()) {
            return amazon(clsMopub, listMo1617throws);
        }
        if (clsMopub.getComponentType().isPrimitive()) {
            return clsMopub;
        }
        C0861l c0861l = (C0861l) AbstractC16901l.m4236public(listMo1617throws);
        if (c0861l == null) {
            C1759l.ads(interfaceC13012l, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        int i = c0861l.yandex;
        InterfaceC13012l interfaceC13012l2 = c0861l.loadAd;
        int i2 = i == 0 ? -1 : AbstractC15090l.yandex[AbstractC5020l.inmobi(i)];
        if (i2 == -1 || i2 == 1) {
            return clsMopub;
        }
        if (i2 == 2 || i2 == 3) {
            Type typeCrashlytics = crashlytics(interfaceC13012l2, false);
            return typeCrashlytics instanceof Class ? clsMopub : new C11341l(typeCrashlytics);
        }
        C18725l.billing();
        return null;
    }

    public static float firebase(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final Type isPro(C0861l c0861l) {
        int i = c0861l.yandex;
        if (i == 0) {
            return C3167l.f6802l;
        }
        InterfaceC13012l interfaceC13012l = c0861l.loadAd;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return crashlytics(interfaceC13012l, true);
        }
        if (iInmobi == 1) {
            return new C3167l(null, crashlytics(interfaceC13012l, true));
        }
        if (iInmobi == 2) {
            return new C3167l(crashlytics(interfaceC13012l, true), null);
        }
        C18725l.billing();
        return null;
    }

    public static final InterfaceC8714l loadAd(InterfaceC6942l interfaceC6942l, Object obj, C6956l c6956l, int i) {
        Object obj2 = C17218l.f33421l;
        boolean zAdmob = c6956l.admob(obj2) | c6956l.admob(interfaceC6942l);
        Object objM2132native = c6956l.m2132native();
        InterfaceC14029l interfaceC14029l = null;
        Object obj3 = C1867l.yandex;
        if (zAdmob || objM2132native == obj3) {
            objM2132native = new C17949l(obj2, interfaceC6942l, interfaceC14029l, 26);
            c6956l.m2147try(objM2132native);
        }
        Function2 function2 = (Function2) objM2132native;
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == obj3) {
            objM2132native2 = smaato(obj);
            c6956l.m2147try(objM2132native2);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
        boolean zAdmob2 = c6956l.admob(function2);
        Object objM2132native3 = c6956l.m2132native();
        if (zAdmob2 || objM2132native3 == obj3) {
            objM2132native3 = new C4592l(function2, interfaceC8714l, interfaceC14029l, 1);
            c6956l.m2147try(objM2132native3);
        }
        AbstractC12311l.purchase(interfaceC6942l, obj2, (Function2) objM2132native3, c6956l);
        return interfaceC8714l;
    }

    public static final C14970l metrica(Function0 function0) {
        return new C14970l(8, new C0469l(function0, (InterfaceC14029l) null, 18));
    }

    public static final C8610l mopub(Function0 function0) {
        C4816l c4816l = AbstractC5929l.yandex;
        return new C8610l(null, function0);
    }

    public static final C17893l purchase() {
        C4816l c4816l = AbstractC5929l.loadAd;
        C17893l c17893l = (C17893l) c4816l.get();
        if (c17893l != null) {
            return c17893l;
        }
        C17893l c17893l2 = new C17893l(0, new C8957l[0]);
        c4816l.firebase(c17893l2);
        return c17893l2;
    }

    public static final InterfaceC8714l remoteconfig(C6956l c6956l, Object obj, Function2 function2) {
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = smaato(obj);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        Unit unit = Unit.INSTANCE;
        boolean zAdmob = c6956l.admob(function2);
        Object objM2132native2 = c6956l.m2132native();
        if (zAdmob || objM2132native2 == c13863l) {
            objM2132native2 = new C4592l(function2, interfaceC8714l, null, 0);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
        return interfaceC8714l;
    }

    public static C10086l smaato(Object obj) {
        return new C10086l(obj, C7472l.f15463l);
    }

    public static C9358l startapp(C7396l c7396l) throws GeneralSecurityException {
        if (c7396l == C7396l.f15322l) {
            return C9358l.crashlytics;
        }
        if (c7396l == C7396l.f15324l) {
            return C9358l.billing;
        }
        if (c7396l == C7396l.f15323l) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c7396l)));
    }

    public static final Type subs(InterfaceC13012l interfaceC13012l) {
        if (interfaceC13012l instanceof AbstractC6786l) {
            C2343l c2343l = ((AbstractC6786l) interfaceC13012l).f14215l;
            Type type = c2343l != null ? (Type) c2343l.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return crashlytics(interfaceC13012l, false);
    }

    public static final InterfaceC8714l vip(Object obj, C6956l c6956l) {
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = smaato(obj);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        interfaceC8714l.setValue(obj);
        return interfaceC8714l;
    }

    public static final String yandex(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC11075l interfaceC11075lRemoteconfig = AbstractC17587l.remoteconfig(type, C15561l.f30403l);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) AbstractC17587l.metrica(interfaceC11075lRemoteconfig)).getName());
        Iterator it = interfaceC11075lRemoteconfig.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AbstractC14055l.ads();
                throw null;
            }
        }
        sb.append(AbstractC16648l.ad(i, "[]"));
        return sb.toString();
    }
}
