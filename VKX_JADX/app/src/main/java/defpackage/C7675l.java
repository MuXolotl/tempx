package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: renamed from: lؘؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7675l implements InterfaceC1388l, InterfaceC13937l, InterfaceC6679l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Map f16099l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Class f16100l;

    static {
        int i = 0;
        List listRemoteconfig = AbstractC14055l.remoteconfig(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listRemoteconfig, 10));
        for (Object obj : listRemoteconfig) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            arrayList.add(new C8195l((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f16099l = AbstractC8676l.subscription(arrayList);
    }

    public C7675l(Class cls) {
        this.f16100l = cls;
    }

    public static void subs() {
        throw new C3150l();
    }

    @Override // defpackage.InterfaceC1388l
    public final Collection adcel() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean ads() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC1388l
    public final Object advert() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean applovin() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC1388l
    public final String billing() {
        String strYandex;
        Class cls = this.f16100l;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strYandex2 = AbstractC10802l.yandex(cls.getName());
            return strYandex2 == null ? cls.getCanonicalName() : strYandex2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strYandex = AbstractC10802l.yandex(componentType.getName())) != null) {
            strConcat = strYandex.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7675l) && AbstractC16131l.mopub(this).equals(AbstractC16131l.mopub((InterfaceC1388l) obj));
    }

    @Override // defpackage.InterfaceC1388l
    public final List getTypeParameters() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC1388l
    public final int hashCode() {
        return AbstractC16131l.mopub(this).hashCode();
    }

    @Override // defpackage.InterfaceC1388l
    public final String license() {
        String strMopub;
        Class cls = this.f16100l;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strMopub2 = AbstractC10802l.mopub(cls.getName());
                return strMopub2 == null ? cls.getSimpleName() : strMopub2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strMopub = AbstractC10802l.mopub(componentType.getName())) != null) {
                strConcat = strMopub.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC12024l.m3313break(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM3321extends = AbstractC12024l.m3321extends(simpleName, '$', 0, 6);
            return iM3321extends == -1 ? simpleName : simpleName.substring(iM3321extends + 1, simpleName.length());
        }
        return AbstractC12024l.m3313break(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // defpackage.InterfaceC1388l
    public final Collection mopub() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC1388l
    /* JADX INFO: renamed from: native */
    public final Collection mo885native() {
        subs();
        throw null;
    }

    @Override // defpackage.InterfaceC13937l
    /* JADX INFO: renamed from: private */
    public final Class mo1730private() {
        return this.f16100l;
    }

    @Override // defpackage.InterfaceC6679l
    public final GenericDeclaration remoteconfig() {
        return this.f16100l;
    }

    @Override // defpackage.InterfaceC1388l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo886strictfp(Object obj) {
        Map map = f16099l;
        Class clsMopub = this.f16100l;
        Integer num = (Integer) map.get(clsMopub);
        if (num != null) {
            return AbstractC9464l.firebase(num.intValue(), obj);
        }
        if (clsMopub.isPrimitive()) {
            clsMopub = AbstractC16131l.mopub(AbstractC18202l.yandex.loadAd(clsMopub));
        }
        return clsMopub.isInstance(obj);
    }

    @Override // defpackage.InterfaceC1388l
    public final boolean subscription() {
        subs();
        throw null;
    }

    public final String toString() {
        return this.f16100l.toString() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.InterfaceC1388l
    public final List yandex() {
        subs();
        throw null;
    }
}
