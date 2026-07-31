package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘَۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5591l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11875l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11876l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11877l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f11878l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11879l;

    public C5591l(InterfaceC9427l interfaceC9427l, Charset charset, C11310l c11310l, InterfaceC9354l interfaceC9354l) {
        this.f11877l = 1;
        this.f11876l = interfaceC9427l;
        this.f11875l = charset;
        this.f11879l = c11310l;
        this.f11878l = interfaceC9354l;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        C3728l c3728l;
        C6450l c6450l;
        InterfaceC9427l interfaceC9427l;
        Object obj2 = obj;
        int i = this.f11877l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = 0;
        int i3 = 1;
        Object obj3 = this.f11876l;
        Object obj4 = this.f11875l;
        Object obj5 = this.f11879l;
        Object obj6 = this.f11878l;
        switch (i) {
            case 0:
                C10700l c10700l = (C10700l) obj4;
                if (interfaceC14029l instanceof C3728l) {
                    c3728l = (C3728l) interfaceC14029l;
                    int i4 = c3728l.f7790l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3728l.f7790l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3728l = new C3728l(this, interfaceC14029l);
                    }
                } else {
                    c3728l = new C3728l(this, interfaceC14029l);
                }
                Object obj7 = c3728l.f7791l;
                int i5 = c3728l.f7790l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj7);
                    InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c10700l.f21708l;
                    if (interfaceC7042l != null) {
                        interfaceC7042l.ads(new C9240l("Child of the scoped flow was cancelled"));
                        c3728l.f7792l = obj2;
                        c3728l.f7790l = 1;
                        if (interfaceC7042l.mo2158switch(c3728l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = c3728l.f7792l;
                    AbstractC2829l.crashlytics(obj7);
                }
                c10700l.f21708l = AbstractC10999l.mopub((InterfaceC2262l) obj5, null, 4, new C17784l((C12867l) obj6, (InterfaceC9427l) obj3, obj2, null), 1);
                return Unit.INSTANCE;
            case 1:
                if (interfaceC14029l instanceof C6450l) {
                    c6450l = (C6450l) interfaceC14029l;
                    int i6 = c6450l.f13483l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6450l.f13483l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6450l = new C6450l(this, interfaceC14029l);
                    }
                } else {
                    c6450l = new C6450l(this, interfaceC14029l);
                }
                Object obj8 = c6450l.f13484l;
                int i7 = c6450l.f13483l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        i2 = c6450l.f13481l;
                        interfaceC9427l = c6450l.f13485l;
                        AbstractC2829l.crashlytics(obj8);
                    } else {
                        if (i7 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj8);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj8);
                InterfaceC9427l interfaceC9427l2 = (InterfaceC9427l) obj3;
                c6450l.f13485l = interfaceC9427l2;
                c6450l.f13481l = 0;
                c6450l.f13483l = 1;
                Object objYandex = ((InterfaceC18129l) obj2).yandex((Charset) obj4, (C11310l) obj5, (InterfaceC9354l) obj6, c6450l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC9427l = interfaceC9427l2;
                obj8 = objYandex;
                c6450l.f13485l = null;
                c6450l.f13481l = i2;
                c6450l.f13483l = 2;
                if (interfaceC9427l.isPro(obj8, c6450l) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 2:
                C16173l c16173l = (C16173l) obj6;
                C17812l c17812l = (C17812l) obj4;
                if (((Boolean) obj2).booleanValue() && c17812l.loadAd()) {
                    AbstractC16817l.startapp((C8877l) obj5, c17812l, c16173l.vip(), (C14966l) obj3, c16173l.loadAd);
                } else {
                    AbstractC16817l.subs(c17812l);
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC12553l interfaceC12553l = (InterfaceC12553l) obj2;
                C9987l c9987l = (C9987l) obj6;
                C9987l c9987l2 = (C9987l) obj5;
                C9987l c9987l3 = (C9987l) obj4;
                if (interfaceC12553l instanceof C12951l) {
                    c9987l3.f20387l++;
                } else if ((interfaceC12553l instanceof C3426l) || (interfaceC12553l instanceof C10129l)) {
                    c9987l3.f20387l--;
                } else if (interfaceC12553l instanceof C0261l) {
                    c9987l2.f20387l++;
                } else if (interfaceC12553l instanceof C12134l) {
                    c9987l2.f20387l--;
                } else if (interfaceC12553l instanceof C7008l) {
                    c9987l.f20387l++;
                } else if (interfaceC12553l instanceof C17768l) {
                    c9987l.f20387l--;
                }
                boolean z = c9987l3.f20387l > 0;
                boolean z2 = c9987l2.f20387l > 0;
                boolean z3 = c9987l.f20387l > 0;
                C3249l c3249l = (C3249l) obj3;
                if (c3249l.f6943l != z) {
                    c3249l.f6943l = z;
                    i2 = 1;
                }
                if (c3249l.f6944l != z2) {
                    c3249l.f6944l = z2;
                    i2 = 1;
                }
                if (c3249l.f6946l != z3) {
                    c3249l.f6946l = z3;
                } else {
                    i3 = i2;
                }
                if (i3 != 0) {
                    AbstractC2697l.firebase(c3249l);
                }
                return Unit.INSTANCE;
            case 4:
                return yandex((InterfaceC12553l) obj2, interfaceC14029l);
            default:
                return loadAd((int[]) obj2, interfaceC14029l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4.isPro(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r4.isPro(r2, r5) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(int[] r18, defpackage.InterfaceC14029l r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.f11879l
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r4 = r0.f11876l
            lٌٍۜ r4 = (defpackage.InterfaceC9427l) r4
            boolean r5 = r2 instanceof defpackage.C9563l
            if (r5 == 0) goto L21
            r5 = r2
            lٍٍٔ r5 = (defpackage.C9563l) r5
            int r6 = r5.f19476l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L21
            int r6 = r6 - r7
            r5.f19476l = r6
            goto L26
        L21:
            lٍٍٔ r5 = new lٍٍٔ
            r5.<init>(r0, r2)
        L26:
            java.lang.Object r2 = r5.f19479l
            int r6 = r5.f19476l
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L47
            if (r6 == r9) goto L3a
            if (r6 != r8) goto L34
            goto L3a
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            return r7
        L3a:
            int[] r0 = r5.f19477l
            lؘَۡ r1 = r5.f19478l
            defpackage.AbstractC2829l.crashlytics(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto Lad
        L47:
            defpackage.AbstractC2829l.crashlytics(r2)
            java.lang.Object r2 = r0.f11875l
            lَۥۚ r2 = (defpackage.C10700l) r2
            java.lang.Object r6 = r2.f21708l
            lٍؗؐ r10 = defpackage.EnumC9342l.f19165l
            if (r6 != 0) goto L65
            java.util.Set r2 = defpackage.AbstractC8669l.m2407import(r3)
            r5.f19478l = r0
            r5.f19477l = r1
            r5.f19476l = r9
            java.lang.Object r2 = r4.isPro(r2, r5)
            if (r2 != r10) goto Lad
            goto Lac
        L65:
            java.lang.Object r6 = r0.f11878l
            int[] r6 = (int[]) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r3.length
            r12 = 0
            r13 = r12
        L71:
            if (r12 >= r11) goto L96
            r14 = r3[r12]
            int r15 = r13 + 1
            r19 = r7
            java.lang.Object r7 = r2.f21708l
            if (r7 == 0) goto L90
            int[] r7 = (int[]) r7
            r13 = r6[r13]
            r7 = r7[r13]
            r13 = r1[r13]
            if (r7 == r13) goto L8a
            r9.add(r14)
        L8a:
            int r12 = r12 + 1
            r7 = r19
            r13 = r15
            goto L71
        L90:
            java.lang.String r0 = "Required value was null."
            defpackage.C8339l.smaato(r0)
            return r19
        L96:
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lad
            java.util.Set r2 = defpackage.AbstractC16901l.m4229l(r9)
            r5.f19478l = r0
            r5.f19477l = r1
            r5.f19476l = r8
            java.lang.Object r2 = r4.isPro(r2, r5)
            if (r2 != r10) goto Lad
        Lac:
            return r10
        Lad:
            java.lang.Object r0 = r0.f11875l
            lَۥۚ r0 = (defpackage.C10700l) r0
            r0.f21708l = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5591l.loadAd(int[], lٌؚٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object yandex(InterfaceC12553l interfaceC12553l, InterfaceC14029l interfaceC14029l) {
        C14963l c14963l;
        Iterator it;
        InterfaceC12553l interfaceC12553l2;
        C3316l c3316l = (C3316l) this.f11876l;
        C3316l c3316l2 = (C3316l) this.f11878l;
        C3316l c3316l3 = (C3316l) this.f11875l;
        C6257l c6257l = (C6257l) this.f11879l;
        if (interfaceC14029l instanceof C14963l) {
            c14963l = (C14963l) interfaceC14029l;
            int i = c14963l.f29437l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14963l.f29437l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14963l = new C14963l(this, interfaceC14029l);
            }
        } else {
            c14963l = new C14963l(this, interfaceC14029l);
        }
        Object obj = c14963l.f29433l;
        int i2 = c14963l.f29437l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (interfaceC12553l instanceof C12951l) {
                c3316l3.billing(interfaceC12553l);
                c6257l.crashlytics(true);
            } else if (interfaceC12553l instanceof C3426l) {
                c3316l3.startapp(((C3426l) interfaceC12553l).yandex);
                c6257l.crashlytics(c3316l3.f7072l != null);
            } else if (interfaceC12553l instanceof C10129l) {
                c3316l3.startapp(((C10129l) interfaceC12553l).yandex);
                c6257l.crashlytics(c3316l3.f7072l != null);
            } else if (interfaceC12553l instanceof C0261l) {
                c3316l2.billing(interfaceC12553l);
                c6257l.loadAd(true);
            } else if (interfaceC12553l instanceof C12134l) {
                c3316l2.startapp(((C12134l) interfaceC12553l).yandex);
                c6257l.loadAd(c3316l2.f7072l != null);
            } else if (interfaceC12553l instanceof C7008l) {
                c3316l.billing(interfaceC12553l);
                c6257l.yandex(true);
            } else if (interfaceC12553l instanceof C17768l) {
                c3316l.startapp(((C17768l) interfaceC12553l).yandex);
                c6257l.yandex(c3316l.f7072l != null);
            } else {
                it = c6257l.loadAd.f24466l.iterator();
                interfaceC12553l2 = interfaceC12553l;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        it = c14963l.f29438l;
        C6257l c6257l2 = c14963l.f29435l;
        InterfaceC12553l interfaceC12553l3 = c14963l.f29436l;
        AbstractC2829l.crashlytics(obj);
        c6257l = c6257l2;
        interfaceC12553l2 = interfaceC12553l3;
        while (it.hasNext()) {
            AbstractC15711l abstractC15711l = (AbstractC15711l) ((Map.Entry) it.next()).getKey();
            c14963l.f29436l = interfaceC12553l2;
            c14963l.f29435l = c6257l;
            c14963l.f29438l = it;
            c14963l.f29437l = 1;
            abstractC15711l.getClass();
            Unit unit = Unit.INSTANCE;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (unit == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    public C5591l(C10700l c10700l, InterfaceC9427l interfaceC9427l, String[] strArr, int[] iArr) {
        this.f11877l = 5;
        this.f11875l = c10700l;
        this.f11876l = interfaceC9427l;
        this.f11879l = strArr;
        this.f11878l = iArr;
    }

    public /* synthetic */ C5591l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11877l = i;
        this.f11875l = obj;
        this.f11879l = obj2;
        this.f11878l = obj3;
        this.f11876l = obj4;
    }
}
