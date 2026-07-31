package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lًّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7694l {
    public static final Class crashlytics;
    public static final Set yandex = Collections.EMPTY_SET;
    public static final Type[] loadAd = new Type[0];

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        crashlytics = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static String admob(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static boolean amazon(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public static Type billing(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type type3;
        WildcardType wildcardType;
        Type[] lowerBounds;
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeBilling = billing(type, cls, componentType, linkedHashSet);
                        return componentType == typeBilling ? cls2 : new C10190l(typeBilling);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeBilling2 = billing(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == typeBilling2 ? genericArrayType : new C10190l(typeBilling2);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeBilling3 = billing(type, cls, ownerType, linkedHashSet);
                    boolean z = typeBilling3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeBilling4 = billing(type, cls, actualTypeArguments[i], linkedHashSet);
                        if (typeBilling4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeBilling4;
                        }
                        i++;
                    }
                    return z ? new C5693l(typeBilling3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof WildcardType) {
                    wildcardType = (WildcardType) type2;
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds2.length == 1) {
                        Type typeBilling5 = billing(type, cls, lowerBounds2[0], linkedHashSet);
                        if (typeBilling5 != lowerBounds2[0]) {
                            if (typeBilling5 instanceof WildcardType) {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = ((WildcardType) typeBilling5).getLowerBounds();
                            } else {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = new Type[]{typeBilling5};
                            }
                            return new C9693l(new Type[]{Object.class}, lowerBounds);
                        }
                    } else if (upperBounds.length == 1) {
                        type3 = type2;
                        type3 = wildcardType;
                        Type typeBilling6 = billing(type, cls, upperBounds[0], linkedHashSet);
                        type3 = wildcardType;
                        if (typeBilling6 != upperBounds[0]) {
                            return new C9693l(typeBilling6 instanceof WildcardType ? ((WildcardType) typeBilling6).getUpperBounds() : new Type[]{typeBilling6}, loadAd);
                        }
                    }
                }
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeCrashlytics = crashlytics(type, cls, cls3);
                if (typeCrashlytics instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            C4875l.firebase();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeCrashlytics).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static Type crashlytics(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return crashlytics(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return crashlytics(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static C6451l isPro(String str, String str2, C0396l c0396l) {
        String string;
        String strInmobi = c0396l.inmobi();
        if (str2.equals(str)) {
            string = AbstractC14814l.adcel("Non-null value '", str, "' was null at ", strInmobi);
        } else {
            StringBuilder sbLicense = AbstractC14814l.license("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbLicense.append(strInmobi);
            string = sbLicense.toString();
        }
        return new C6451l(string, 8, (byte) 0);
    }

    public static void loadAd(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            C10754l.startapp(type, ". Use the boxed type.", "Unexpected primitive ");
        }
    }

    public static void mopub(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static C6451l purchase(String str, String str2, C0396l c0396l) {
        String string;
        String strInmobi = c0396l.inmobi();
        if (str2.equals(str)) {
            string = AbstractC14814l.adcel("Required value '", str, "' missing at ", strInmobi);
        } else {
            StringBuilder sbLicense = AbstractC14814l.license("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbLicense.append(strInmobi);
            string = sbLicense.toString();
        }
        return new C6451l(string, 8, (byte) 0);
    }

    public static String subs(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type yandex(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C10190l(yandex(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C5693l) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5693l(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof C10190l ? type : new C10190l(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C9693l)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C9693l(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }
}
