package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: lٖٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0359l implements InterfaceC16148l {
    public final C5991l crashlytics;
    public final boolean loadAd;
    public final InterfaceC16148l yandex;

    /* JADX WARN: Code duplicated, block: B:128:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[EDGE_INSN: B:32:0x0082->B:52:0x00bd BREAK  A[LOOP:4: B:39:0x0095->B:153:?]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r15 = defpackage.AbstractC13457l.smaato(r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0359l(defpackage.InterfaceC16148l r12, defpackage.InterfaceC18672l r13, java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0359l.<init>(lٖؓٚ, lۤؕ, java.util.List, boolean):void");
    }

    @Override // defpackage.InterfaceC16148l
    public final Object amazon(Object[] objArr) {
        Object objInvoke;
        Method method;
        C5991l c5991l = this.crashlytics;
        C8934l c8934l = (C8934l) c5991l.f12716l;
        Method[] methodArr = (Method[]) c5991l.f12715l;
        Method method2 = (Method) c5991l.f12718l;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objInvoke2 = objArr[i];
            int i2 = c8934l.f15488l;
            if (i <= c8934l.f15487l && i2 <= i && (method = methodArr[i]) != null) {
                objInvoke2 = objInvoke2 != null ? method.invoke(objInvoke2, null) : AbstractC5592l.amazon(method.getReturnType());
            }
            objArr2[i] = objInvoke2;
        }
        Object objAmazon = this.yandex.amazon(objArr2);
        return (objAmazon == EnumC9342l.f19165l || method2 == null || (objInvoke = method2.invoke(null, objAmazon)) == null) ? objAmazon : objInvoke;
    }

    @Override // defpackage.InterfaceC16148l
    public final boolean crashlytics() {
        return this.yandex instanceof C12056l;
    }

    @Override // defpackage.InterfaceC16148l
    public final Member loadAd() {
        return this.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC16148l
    public final Type smaato() {
        return this.yandex.smaato();
    }

    @Override // defpackage.InterfaceC16148l
    public final List yandex() {
        return this.yandex.yandex();
    }
}
