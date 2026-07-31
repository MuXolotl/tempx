package defpackage;

import j$.util.DesugarCollections;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: lٓؐٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13850l implements InterfaceC5644l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13850l(int i) {
        this.yandex = i;
    }

    public static void loadAd(Type type, Class cls) {
        Class<?> clsPurchase = AbstractC15639l.purchase(type);
        if (cls.isAssignableFrom(clsPurchase)) {
            StringBuilder sb = new StringBuilder("No JsonAdapter for ");
            sb.append(type);
            String simpleName = cls.getSimpleName();
            String simpleName2 = clsPurchase.getSimpleName();
            sb.append(", you should probably use ");
            sb.append(simpleName);
            sb.append(" instead of ");
            sb.append(simpleName2);
            sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x025b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [lُؚِ] */
    @Override // defpackage.InterfaceC5644l
    public final AbstractC7188l yandex(Type type, Set set, C12952l c12952l) {
        LinkedHashSet linkedHashSet;
        AbstractC9549l c1827l;
        Class cls;
        boolean z;
        Field[] fieldArr;
        boolean z2;
        InterfaceC9347l interfaceC9347l;
        Class clsPurchase;
        Type[] actualTypeArguments;
        C6064l c6064lAmazon;
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type typeBilling = type;
        int i = this.yandex;
        Class cls3 = Integer.TYPE;
        int i2 = 0;
        boolean z3 = true;
        LinkedHashSet linkedHashSet2 = null;
        switch (i) {
            case 0:
                Type genericComponentType = typeBilling instanceof GenericArrayType ? ((GenericArrayType) typeBilling).getGenericComponentType() : typeBilling instanceof Class ? ((Class) typeBilling).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new C5011l(AbstractC15639l.purchase(genericComponentType), c12952l.yandex(genericComponentType)).amazon();
                }
                return null;
            case 1:
                if ((typeBilling instanceof Class) || (typeBilling instanceof ParameterizedType)) {
                    Class clsPurchase2 = AbstractC15639l.purchase(typeBilling);
                    if (!clsPurchase2.isInterface() && !clsPurchase2.isEnum() && set.isEmpty()) {
                        if (AbstractC7694l.amazon(clsPurchase2)) {
                            loadAd(typeBilling, List.class);
                            loadAd(typeBilling, Set.class);
                            loadAd(typeBilling, Map.class);
                            loadAd(typeBilling, Collection.class);
                            String str = "Platform " + clsPurchase2;
                            if (typeBilling instanceof ParameterizedType) {
                                str = str + " in " + typeBilling;
                            }
                            C8339l.metrica(str.concat(" requires explicit JsonAdapter to be registered"));
                            return null;
                        }
                        if (clsPurchase2.isAnonymousClass()) {
                            C8339l.metrica("Cannot serialize anonymous class ".concat(clsPurchase2.getName()));
                            return null;
                        }
                        if (clsPurchase2.isLocalClass()) {
                            C8339l.metrica("Cannot serialize local class ".concat(clsPurchase2.getName()));
                            return null;
                        }
                        if (clsPurchase2.getEnclosingClass() != null && !Modifier.isStatic(clsPurchase2.getModifiers())) {
                            C8339l.metrica("Cannot serialize non-static nested class ".concat(clsPurchase2.getName()));
                            return null;
                        }
                        if (Modifier.isAbstract(clsPurchase2.getModifiers())) {
                            C8339l.metrica("Cannot serialize abstract class ".concat(clsPurchase2.getName()));
                            return null;
                        }
                        Class<? extends Annotation> cls4 = AbstractC7694l.crashlytics;
                        if (cls4 != null && clsPurchase2.isAnnotationPresent(cls4)) {
                            C4875l.smaato(clsPurchase2.getName(), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.", "Cannot serialize Kotlin type ");
                            return null;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        Constructor declaredConstructor2 = clsPurchase2.getDeclaredConstructor(null);
                                        declaredConstructor2.setAccessible(true);
                                        c1827l = new C1827l(declaredConstructor2, clsPurchase2);
                                    } catch (IllegalAccessException unused) {
                                        linkedHashSet = null;
                                        C11586l.yandex();
                                    } catch (NoSuchMethodException unused2) {
                                        Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                        declaredMethod.setAccessible(true);
                                        c1827l = new C1827l(declaredMethod, clsPurchase2);
                                    } catch (InvocationTargetException e) {
                                        AbstractC7694l.mopub(e);
                                        throw null;
                                    }
                                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                    declaredMethod2.setAccessible(true);
                                    int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                                    Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, cls3);
                                    declaredMethod3.setAccessible(true);
                                    c1827l = new C13970l(declaredMethod3, clsPurchase2, iIntValue);
                                } catch (IllegalAccessException unused4) {
                                    linkedHashSet = null;
                                    C11586l.yandex();
                                }
                            } catch (Exception unused5) {
                                linkedHashSet = null;
                                C8339l.metrica("cannot construct instances of ".concat(clsPurchase2.getName()));
                            }
                            break;
                        } catch (NoSuchMethodException unused6) {
                            Class<?> cls5 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls5.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            c1827l = new C3193l(cls5.getMethod("allocateInstance", Class.class), declaredField.get(null), clsPurchase2);
                        }
                        TreeMap treeMap = new TreeMap();
                        while (typeBilling != Object.class) {
                            Class clsPurchase3 = AbstractC15639l.purchase(typeBilling);
                            boolean zAmazon = AbstractC7694l.amazon(clsPurchase3);
                            Field[] declaredFields = clsPurchase3.getDeclaredFields();
                            int length = declaredFields.length;
                            int i3 = i2;
                            while (i3 < length) {
                                Field field = declaredFields[i3];
                                int modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zAmazon) || ((interfaceC9347l = (InterfaceC9347l) field.getAnnotation(InterfaceC9347l.class)) != null && interfaceC9347l.ignore()))) {
                                    cls = clsPurchase3;
                                    z = zAmazon;
                                    fieldArr = declaredFields;
                                    z2 = z3;
                                    linkedHashSet = linkedHashSet2;
                                } else {
                                    Type typeBilling2 = AbstractC7694l.billing(typeBilling, clsPurchase3, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    linkedHashSet = linkedHashSet2;
                                    int length2 = annotations.length;
                                    LinkedHashSet linkedHashSet3 = linkedHashSet;
                                    int i4 = 0;
                                    while (i4 < length2) {
                                        Class cls6 = clsPurchase3;
                                        Annotation annotation = annotations[i4];
                                        boolean z4 = zAmazon;
                                        Field[] fieldArr2 = declaredFields;
                                        if (annotation.annotationType().isAnnotationPresent(InterfaceC10729l.class)) {
                                            LinkedHashSet linkedHashSet4 = linkedHashSet3 == null ? new LinkedHashSet() : linkedHashSet3;
                                            linkedHashSet4.add(annotation);
                                            linkedHashSet3 = linkedHashSet4;
                                        }
                                        i4++;
                                        clsPurchase3 = cls6;
                                        zAmazon = z4;
                                        declaredFields = fieldArr2;
                                    }
                                    cls = clsPurchase3;
                                    z = zAmazon;
                                    fieldArr = declaredFields;
                                    Set setUnmodifiableSet = linkedHashSet3 != null ? DesugarCollections.unmodifiableSet(linkedHashSet3) : AbstractC7694l.yandex;
                                    String name = field.getName();
                                    AbstractC7188l abstractC7188lLoadAd = c12952l.loadAd(typeBilling2, setUnmodifiableSet, name);
                                    z2 = true;
                                    field.setAccessible(true);
                                    if (interfaceC9347l != null) {
                                        String strName = interfaceC9347l.name();
                                        if (!"\u0000".equals(strName)) {
                                            name = strName;
                                        }
                                    }
                                    C12271l c12271l = (C12271l) treeMap.put(name, new C12271l(name, field, abstractC7188lLoadAd));
                                    if (c12271l != null) {
                                        C8936l.remoteconfig("Conflicting fields:\n    ", c12271l.loadAd, "\n    ", field);
                                    }
                                }
                                i3++;
                                clsPurchase3 = cls;
                                zAmazon = z;
                                z3 = z2;
                                linkedHashSet2 = linkedHashSet;
                                declaredFields = fieldArr;
                            }
                            Class clsPurchase4 = AbstractC15639l.purchase(typeBilling);
                            typeBilling = AbstractC7694l.billing(typeBilling, clsPurchase4, clsPurchase4.getGenericSuperclass(), new LinkedHashSet());
                            i2 = 0;
                        }
                        return new C16787l(c1827l, treeMap).amazon();
                    }
                    linkedHashSet = null;
                } else {
                    linkedHashSet = null;
                }
                return linkedHashSet;
            case 2:
                Class clsPurchase5 = AbstractC15639l.purchase(typeBilling);
                if (!set.isEmpty()) {
                    return null;
                }
                if (clsPurchase5 == List.class || clsPurchase5 == Collection.class) {
                    return new C5079l(c12952l.yandex(AbstractC15639l.yandex(typeBilling)), 0).amazon();
                }
                if (clsPurchase5 == Set.class) {
                    return new C5079l(c12952l.yandex(AbstractC15639l.yandex(typeBilling)), 1).amazon();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (clsPurchase = AbstractC15639l.purchase(typeBilling)) != Map.class) {
                    return null;
                }
                if (typeBilling == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsPurchase)) {
                        C11983l.crashlytics();
                        return null;
                    }
                    Type typeBilling3 = AbstractC7694l.billing(typeBilling, clsPurchase, AbstractC7694l.crashlytics(typeBilling, clsPurchase, Map.class), new LinkedHashSet());
                    actualTypeArguments = typeBilling3 instanceof ParameterizedType ? ((ParameterizedType) typeBilling3).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new C5011l(c12952l, actualTypeArguments[0], actualTypeArguments[1]).amazon();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls7 = Boolean.TYPE;
                C13635l c13635l = AbstractC8320l.loadAd;
                if (typeBilling == cls7) {
                    return c13635l;
                }
                Class cls8 = Byte.TYPE;
                C13635l c13635l2 = AbstractC8320l.crashlytics;
                if (typeBilling == cls8) {
                    return c13635l2;
                }
                Class cls9 = Character.TYPE;
                C13635l c13635l3 = AbstractC8320l.amazon;
                if (typeBilling == cls9) {
                    return c13635l3;
                }
                Class cls10 = Double.TYPE;
                C13635l c13635l4 = AbstractC8320l.purchase;
                if (typeBilling == cls10) {
                    return c13635l4;
                }
                Class cls11 = Float.TYPE;
                C13635l c13635l5 = AbstractC8320l.billing;
                if (typeBilling == cls11) {
                    return c13635l5;
                }
                C13635l c13635l6 = AbstractC8320l.mopub;
                if (typeBilling == cls3) {
                    return c13635l6;
                }
                Class cls12 = Long.TYPE;
                C13635l c13635l7 = AbstractC8320l.admob;
                if (typeBilling == cls12) {
                    return c13635l7;
                }
                Class cls13 = Short.TYPE;
                C13635l c13635l8 = AbstractC8320l.subs;
                if (typeBilling == cls13) {
                    return c13635l8;
                }
                if (typeBilling == Boolean.class) {
                    return c13635l.amazon();
                }
                if (typeBilling == Byte.class) {
                    return c13635l2.amazon();
                }
                if (typeBilling == Character.class) {
                    return c13635l3.amazon();
                }
                if (typeBilling == Double.class) {
                    return c13635l4.amazon();
                }
                if (typeBilling == Float.class) {
                    return c13635l5.amazon();
                }
                if (typeBilling == Integer.class) {
                    return c13635l6.amazon();
                }
                if (typeBilling == Long.class) {
                    return c13635l7.amazon();
                }
                if (typeBilling == Short.class) {
                    return c13635l8.amazon();
                }
                if (typeBilling == String.class) {
                    return AbstractC8320l.isPro.amazon();
                }
                if (typeBilling == Object.class) {
                    return new C14322l(c12952l).amazon();
                }
                Class clsPurchase6 = AbstractC15639l.purchase(typeBilling);
                Set set2 = AbstractC7694l.yandex;
                InterfaceC15749l interfaceC15749l = (InterfaceC15749l) clsPurchase6.getAnnotation(InterfaceC15749l.class);
                if (interfaceC15749l != null && interfaceC15749l.generateAdapter()) {
                    try {
                        try {
                            cls2 = Class.forName(clsPurchase6.getName().replace("$", "_") + "JsonAdapter", true, clsPurchase6.getClassLoader());
                            try {
                                if (typeBilling instanceof ParameterizedType) {
                                    Type[] actualTypeArguments2 = ((ParameterizedType) typeBilling).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(C12952l.class, Type[].class);
                                        objArr = new Object[]{c12952l, actualTypeArguments2};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments2};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(C12952l.class);
                                        objArr = new Object[]{c12952l};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls2.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                c6064lAmazon = ((AbstractC7188l) declaredConstructor.newInstance(objArr)).amazon();
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                if ((typeBilling instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                                    C1759l.metrica("Failed to find the generated JsonAdapter constructor for ", typeBilling, e);
                                    return null;
                                }
                                StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                                sb.append(typeBilling);
                                String canonicalName = cls2.getCanonicalName();
                                sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                                sb.append(canonicalName);
                                sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                                throw new RuntimeException(sb.toString(), e);
                            }
                        } catch (ClassNotFoundException e3) {
                            C1759l.metrica("Failed to find the generated JsonAdapter class for ", typeBilling, e3);
                            return null;
                        } catch (IllegalAccessException e4) {
                            C1759l.metrica("Failed to access the generated JsonAdapter for ", typeBilling, e4);
                            return null;
                        } catch (InstantiationException e5) {
                            C1759l.metrica("Failed to instantiate the generated JsonAdapter for ", typeBilling, e5);
                            return null;
                        } catch (InvocationTargetException e6) {
                            AbstractC7694l.mopub(e6);
                            throw null;
                        }
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        cls2 = null;
                    }
                    break;
                } else {
                    c6064lAmazon = null;
                }
                if (c6064lAmazon != null) {
                    return c6064lAmazon;
                }
                if (clsPurchase6.isEnum()) {
                    return new C2594l(clsPurchase6).amazon();
                }
                return null;
        }
    }
}
