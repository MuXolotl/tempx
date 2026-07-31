package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17110l {
    public InterfaceC2262l amazon;
    public Function0 crashlytics = new C11029l(12, this);
    public C4369l loadAd;
    public C4369l yandex;

    public final InterfaceC2262l crashlytics() {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.crashlytics.invoke();
        if (interfaceC2262l != null) {
            return interfaceC2262l;
        }
        C8339l.smaato("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(long j, AbstractC0283l abstractC0283l) {
        C11510l c11510l;
        long j2;
        if (abstractC0283l instanceof C11510l) {
            c11510l = (C11510l) abstractC0283l;
            int i = c11510l.f23135l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11510l.f23135l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11510l = new C11510l(this, abstractC0283l);
            }
        } else {
            c11510l = new C11510l(this, abstractC0283l);
        }
        Object objMo1110l = c11510l.f23134l;
        int i2 = c11510l.f23135l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objMo1110l);
            C4369l c4369l = this.yandex;
            C4369l c4369lM1543l = c4369l != null ? c4369l.m1543l() : null;
            if (c4369lM1543l != null) {
                c11510l.f23135l = 1;
                objMo1110l = c4369lM1543l.mo1110l(j, c11510l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objMo1110l == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                j2 = 0;
            }
            return new C12121l(j2);
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objMo1110l);
        j2 = ((C12121l) objMo1110l).yandex;
        return new C12121l(j2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(long r8, long r10, defpackage.AbstractC0283l r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.C2904l
            if (r0 == 0) goto L14
            r0 = r12
            lؔۛؗ r0 = (defpackage.C2904l) r0
            int r1 = r0.f6315l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6315l = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            lؔۛؗ r0 = new lؔۛؗ
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.f6314l
            int r1 = r12.f6315l
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r0)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r2
        L31:
            defpackage.AbstractC2829l.crashlytics(r0)
            goto L55
        L35:
            defpackage.AbstractC2829l.crashlytics(r0)
            lۣؖۙ r0 = r7.yandex
            if (r0 == 0) goto L41
            lۣؖۙ r0 = r0.m1543l()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r0 != 0) goto L5a
            lۣؖۙ r7 = r7.loadAd
            if (r7 == 0) goto L72
            r12.f6315l = r4
            java.lang.Object r0 = r7.mo1113throws(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            lِۛٚ r0 = (defpackage.C12121l) r0
            long r5 = r0.yandex
            goto L72
        L5a:
            lۣؖۙ r7 = r7.yandex
            if (r7 == 0) goto L62
            lۣؖۙ r2 = r7.m1543l()
        L62:
            r7 = r2
            if (r7 == 0) goto L72
            r12.f6315l = r3
            java.lang.Object r0 = r7.mo1113throws(r8, r10, r12)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            lِۛٚ r0 = (defpackage.C12121l) r0
            long r5 = r0.yandex
        L72:
            lِۛٚ r7 = new lِۛٚ
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17110l.yandex(long, long, lّؑۧ):java.lang.Object");
    }
}
