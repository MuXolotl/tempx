package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: lٌؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4769l {
    public static final C9933l yandex = AbstractC2920l.loadAd(C2100l.f4702l, C2100l.f4698l);

    public static final C12644l amazon(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l instanceof C5160l) {
            C2343l c2343l = ((C16024l) ((C5160l) interfaceC1388l).f11211l.getValue()).license;
            InterfaceC13922l interfaceC13922l = C16024l.ad[18];
            return (C12644l) c2343l.invoke();
        }
        if (interfaceC1388l instanceof C9959l) {
            return amazon(((C9959l) interfaceC1388l).f20319l);
        }
        C11983l.advert(AbstractC18202l.yandex.loadAd(interfaceC1388l.getClass()), "Unknown type ");
        return null;
    }

    public static final void billing(Object obj) {
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + obj + '\'').toString());
    }

    public static final Collection crashlytics(InterfaceC1388l interfaceC1388l) {
        C2343l c2343l = ((C16024l) ((C5160l) interfaceC1388l).f11211l.getValue()).tapsense;
        InterfaceC13922l interfaceC13922l = C16024l.ad[16];
        return (Collection) c2343l.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (defpackage.AbstractC11748l.subs(r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.InterfaceC13012l loadAd(defpackage.InterfaceC13012l r7, java.lang.String r8) {
        /*
            boolean r0 = r7 instanceof defpackage.AbstractC6786l
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            lؙ۟ٞ r0 = (defpackage.AbstractC6786l) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L2a
            lؒ٘۟ r2 = r0.mo1616package()
            boolean r2 = r2 instanceof defpackage.C18551l
            if (r2 != 0) goto L29
            boolean r2 = r0 instanceof defpackage.C5380l
            if (r2 == 0) goto L1b
            lؘؒ٘ r0 = (defpackage.C5380l) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L2a
            l٘ٛۢ r0 = r0.f11513l
            if (r0 == 0) goto L2a
            boolean r0 = defpackage.AbstractC11748l.subs(r0)
            r2 = 1
            if (r0 != r2) goto L2a
        L29:
            return r7
        L2a:
            lؒ٘۟ r0 = r7.mo1616package()
            if (r0 == 0) goto L6e
            java.util.List r2 = r7.mo1617throws()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.AbstractC14055l.billing(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r2.next()
            lؒؗۨ r4 = (defpackage.C0861l) r4
            lّٟۧ r5 = r4.loadAd
            if (r5 == 0) goto L58
            lّٟۧ r5 = loadAd(r5, r8)
            goto L59
        L58:
            r5 = r1
        L59:
            int r4 = r4.yandex
            lؒؗۨ r6 = new lؒؗۨ
            r6.<init>(r4, r5)
            r3.add(r6)
            goto L43
        L64:
            java.util.List r7 = r7.getAnnotations()
            r8 = 0
            lؙ۟ٞ r7 = defpackage.AbstractC6427l.purchase(r0, r3, r8, r7, r1)
            return r7
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.Class r7 = r7.getClass()
            lٕؔؒ r2 = defpackage.AbstractC18202l.yandex
            lۣؒ۠ r7 = r2.loadAd(r7)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ") which belongs to member '"
            r1.append(r7)
            r1.append(r8)
            r7 = 39
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4769l.loadAd(lّٟۧ, java.lang.String):lّٟۧ");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C17743l mopub(AbstractC1112l abstractC1112l, AbstractC3292l abstractC3292l) {
        int i;
        Class<?> declaringClass;
        List parameters = abstractC1112l.getParameters();
        ArrayList arrayList = new ArrayList();
        Iterator it = parameters.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AbstractC9707l) next).premium() != 1) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AbstractC9707l) it2.next()).mo1109synchronized());
        }
        boolean z = abstractC1112l instanceof InterfaceC13922l;
        if (z) {
            InterfaceC2957l interfaceC2957lLoadAd = AbstractC5592l.loadAd((InterfaceC13922l) abstractC1112l);
            Field fieldMetrica = interfaceC2957lLoadAd != null ? interfaceC2957lLoadAd.metrica() : null;
            if (fieldMetrica != null && (declaringClass = fieldMetrica.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
                i = 3;
            } else if (z) {
                i = 2;
            } else if (!(abstractC1112l instanceof InterfaceC5059l)) {
                C11983l.advert(AbstractC18202l.yandex.loadAd(abstractC1112l.getClass()), "Unknown kind for ");
                return null;
            }
        } else if (z) {
            i = 2;
        } else if (!(abstractC1112l instanceof InterfaceC5059l)) {
            C11983l.advert(AbstractC18202l.yandex.loadAd(abstractC1112l.getClass()), "Unknown kind for ");
            return null;
        }
        int i2 = i;
        InterfaceC5059l interfaceC5059l = abstractC1112l instanceof InterfaceC5059l ? (InterfaceC5059l) abstractC1112l : null;
        Method methodMetrica = interfaceC5059l != null ? AbstractC13095l.metrica(interfaceC5059l) : null;
        Type[] genericParameterTypes = methodMetrica != null ? methodMetrica.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listM2415super = AbstractC8669l.m2415super(genericParameterTypes);
        Class<?>[] parameterTypes = methodMetrica != null ? methodMetrica.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        return new C17743l(i2, abstractC1112l.getName(), methodMetrica != null ? methodMetrica.getName() : null, abstractC1112l.getTypeParameters(), arrayList2, AbstractC8669l.m2415super(parameterTypes), listM2415super, purchase(abstractC1112l), abstractC3292l);
    }

    public static final boolean purchase(AbstractC1112l abstractC1112l) {
        return AbstractC5592l.billing(abstractC1112l) == null;
    }

    public static final C6702l yandex(List list, List list2) {
        if (list.size() != list2.size()) {
            return null;
        }
        if (list2.isEmpty() || list.isEmpty()) {
            return C6702l.loadAd;
        }
        ArrayList<C8195l> arrayListM4226l = AbstractC16901l.m4226l(list2, list);
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(arrayListM4226l, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (C8195l c8195l : arrayListM4226l) {
            AbstractC11726l abstractC11726l = (AbstractC11726l) c8195l.f17098l;
            AbstractC11726l abstractC11726l2 = (AbstractC11726l) c8195l.f17097l;
            C0861l c0861l = C0861l.crashlytics;
            linkedHashMap.put(abstractC11726l, AbstractC12953l.smaato(AbstractC6427l.amazon(abstractC11726l2, null, 7)));
        }
        return new C6702l(linkedHashMap);
    }
}
