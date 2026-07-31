package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lّٕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15639l {
    public static final C15578l yandex = new C15578l(-206901865, false, new C10721l(5));
    public static final C15578l loadAd = new C15578l(220787534, false, new C10721l(6));

    public static final Object admob(C2369l c2369l, long j, CharSequence charSequence, C3532l c3532l, InterfaceC9354l interfaceC9354l, InterfaceC8639l interfaceC8639l, C7682l c7682l) throws Throwable {
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (charSequence != null && billing(charSequence)) {
            Object objLoadAd = AbstractC10158l.loadAd(interfaceC9354l, interfaceC8639l, c7682l);
            return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
        }
        if (j != -1) {
            Object objAmazon = AbstractC10310l.amazon(interfaceC9354l, interfaceC8639l, j, c7682l);
            return objAmazon == enumC9342l ? objAmazon : Unit.INSTANCE;
        }
        if ((c3532l == null || !c3532l.yandex) && !(c3532l == null && AbstractC8576l.yandex(c2369l, C2369l.mopub))) {
            interfaceC8639l.yandex(new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
            return Unit.INSTANCE;
        }
        Object objAmazon2 = AbstractC10310l.amazon(interfaceC9354l, interfaceC8639l, Long.MAX_VALUE, c7682l);
        return objAmazon2 == enumC9342l ? objAmazon2 : Unit.INSTANCE;
    }

    public static C12759l amazon(List list, Map map, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object obj = (AbstractC18643l) entry.getValue();
            if ((obj instanceof InterfaceC6019l) && ((InterfaceC6019l) obj).yandex()) {
                arrayList.remove(str);
                Unit unit = Unit.INSTANCE;
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new C12759l(linkedHashMap, arrayList, z);
    }

    public static final boolean billing(CharSequence charSequence) {
        C10685l c10685l = AbstractC15176l.yandex;
        if (AbstractC15176l.yandex(charSequence, 0, charSequence.length(), "chunked")) {
            return true;
        }
        if (AbstractC15176l.yandex(charSequence, 0, charSequence.length(), "identity")) {
            return false;
        }
        Iterator it = AbstractC12024l.m3338public(charSequence, new String[]{","}, 6).iterator();
        boolean z = false;
        while (it.hasNext()) {
            String lowerCase = AbstractC12024l.m3330l((String) it.next()).toString().toLowerCase(Locale.ROOT);
            if (lowerCase.equals("chunked")) {
                if (z) {
                    C1759l.ads(charSequence, "Double-chunked TE is not supported: ");
                    return false;
                }
                z = true;
            } else if (!lowerCase.equals("identity")) {
                C8339l.metrica("Unsupported transfer encoding ".concat(lowerCase));
                return false;
            }
        }
        return z;
    }

    public static boolean crashlytics(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? crashlytics(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return crashlytics(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C5693l ? ((C5693l) parameterizedType).f12080l : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C5693l ? ((C5693l) parameterizedType2).f12080l : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return crashlytics(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return crashlytics(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final long loadAd(InterfaceC14189l interfaceC14189l, long j) {
        interfaceC14189l.request(j);
        long jMin = Math.min(j, interfaceC14189l.crashlytics().f36079l);
        interfaceC14189l.crashlytics().skip(jMin);
        return jMin;
    }

    public static C5693l mopub(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C5693l(null, cls, typeArr);
        }
        C8339l.metrica(AbstractC0653l.startapp(cls, "Missing type arguments for "));
        return null;
    }

    public static Class purchase(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) purchase(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return purchase(((WildcardType) type).getUpperBounds()[0]);
        }
        C1759l.smaato("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static Type yandex(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            C11983l.crashlytics();
            return null;
        }
        Type typeBilling = AbstractC7694l.billing(type, Collection.class, AbstractC7694l.crashlytics(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeBilling instanceof WildcardType) {
            typeBilling = ((WildcardType) typeBilling).getUpperBounds()[0];
        }
        return typeBilling instanceof ParameterizedType ? ((ParameterizedType) typeBilling).getActualTypeArguments()[0] : Object.class;
    }
}
