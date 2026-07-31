package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5913l implements InterfaceC16148l {
    public final List amazon;
    public final ArrayList billing;
    public final int crashlytics;
    public final ArrayList loadAd;
    public final ArrayList mopub;
    public final ArrayList purchase;
    public final Class yandex;

    public C5913l(Class cls, ArrayList arrayList, int i, int i2, List list) {
        this.yandex = cls;
        this.loadAd = arrayList;
        this.crashlytics = i;
        this.amazon = list;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.purchase = arrayList2;
        List list2 = this.amazon;
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Class<?> cls2 = (Class) AbstractC1845l.crashlytics.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.billing = arrayList3;
        List list3 = this.amazon;
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.mopub = arrayList4;
        if (this.crashlytics == 2 && i2 == 1 && !AbstractC16901l.m4225interface(this.loadAd, "value").isEmpty()) {
            C10754l.ads("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b A[PHI: r17
  0x008b: PHI (r17v5 java.lang.Object) = (r17v4 java.lang.Object), (r17v6 java.lang.Object) binds: [B:24:0x0055, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139 A[LOOP:0: B:5:0x0015->B:52:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00e1, please report this as an issue */
    @Override // defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        Object obj;
        Class cls;
        InterfaceC1388l interfaceC1388lLoadAd;
        String strBilling;
        C2336l c2336l;
        String strBilling2;
        if (AbstractC17943l.loadAd(this) != objArr.length) {
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(AbstractC17943l.loadAd(this));
            sb.append(" arguments, but ");
            C8339l.metrica(AbstractC14814l.remoteconfig(objArr.length, " were provided.", sb));
            return null;
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.loadAd;
            if (i >= length) {
                return AbstractC17824l.subs(this.yandex, AbstractC8676l.subscription(AbstractC16901l.m4226l(arrayList, arrayList2)), this.amazon);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList3 = this.billing;
            if (array == null && this.crashlytics == 1) {
                array = this.mopub.get(i2);
            } else {
                Class cls2 = (Class) arrayList3.get(i2);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof InterfaceC1388l) {
                        array = ((InterfaceC13937l) ((InterfaceC1388l) array)).mo1730private();
                    } else {
                        if (array instanceof Object[]) {
                            Object[] objArr2 = (Object[]) array;
                            if (objArr2 instanceof Class[]) {
                                obj = null;
                            } else if (objArr2 instanceof InterfaceC1388l[]) {
                                InterfaceC1388l[] interfaceC1388lArr = (InterfaceC1388l[]) array;
                                ArrayList arrayList4 = new ArrayList(interfaceC1388lArr.length);
                                for (InterfaceC1388l interfaceC1388l : interfaceC1388lArr) {
                                    arrayList4.add(((InterfaceC13937l) interfaceC1388l).mo1730private());
                                }
                                obj = null;
                                array = arrayList4.toArray(new Class[0]);
                            } else {
                                obj = null;
                                array = objArr2;
                            }
                            array = obj;
                        }
                        if (!cls2.isInstance(array)) {
                            array = obj;
                        }
                    }
                    obj = null;
                    if (!cls2.isInstance(array)) {
                        array = obj;
                    }
                }
                if (array == null) {
                    String str = (String) arrayList2.get(i2);
                    cls = (Class) arrayList3.get(i2);
                    if (AbstractC8576l.yandex(cls, Class.class)) {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC1388l.class);
                    } else if (cls.isArray() || !AbstractC8576l.yandex(cls.getComponentType(), Class.class)) {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(cls);
                    } else {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC1388l[].class);
                    }
                    strBilling = interfaceC1388lLoadAd.billing();
                    c2336l = AbstractC18202l.yandex;
                    if (AbstractC8576l.yandex(strBilling, c2336l.loadAd(Object[].class).billing())) {
                        strBilling2 = interfaceC1388lLoadAd.billing() + '<' + c2336l.loadAd(((InterfaceC13937l) interfaceC1388lLoadAd).mo1730private().getComponentType()).billing() + '>';
                    } else {
                        strBilling2 = interfaceC1388lLoadAd.billing();
                    }
                    throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strBilling2);
                }
                arrayList.add(array);
                i++;
                i2 = i3;
            }
            if (array == null) {
                String str2 = (String) arrayList2.get(i2);
                cls = (Class) arrayList3.get(i2);
                if (AbstractC8576l.yandex(cls, Class.class)) {
                    interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC1388l.class);
                } else if (cls.isArray()) {
                    interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(cls);
                } else {
                    interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(cls);
                }
                strBilling = interfaceC1388lLoadAd.billing();
                c2336l = AbstractC18202l.yandex;
                if (AbstractC8576l.yandex(strBilling, c2336l.loadAd(Object[].class).billing())) {
                    strBilling2 = interfaceC1388lLoadAd.billing() + '<' + c2336l.loadAd(((InterfaceC13937l) interfaceC1388lLoadAd).mo1730private().getComponentType()).billing() + '>';
                } else {
                    strBilling2 = interfaceC1388lLoadAd.billing();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + strBilling2);
            }
            arrayList.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.InterfaceC16148l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC16148l
    public final /* bridge */ /* synthetic */ Member loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC16148l
    public final Type smaato() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC16148l
    public final List yandex() {
        return this.purchase;
    }

    public /* synthetic */ C5913l(Class cls, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, i, 2, arrayList2);
    }
}
