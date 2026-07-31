package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lۣؖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4369l extends AbstractC14971l implements InterfaceC11189l, InterfaceC12499l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C17110l f8898l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C4369l f8899l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC12499l f8900l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f8901l;

    public C4369l(InterfaceC12499l interfaceC12499l, C17110l c17110l) {
        this.f8900l = interfaceC12499l;
        this.f8898l = c17110l == null ? new C17110l() : c17110l;
        this.f8901l = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.InterfaceC11189l
    public final Object adcel() {
        return this.f8901l;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C10700l c10700l = new C10700l();
        AbstractC13359l.admob(this, new C15121l(c10700l, 2));
        C4369l c4369l = (C4369l) ((InterfaceC11189l) c10700l.f21708l);
        this.f8899l = c4369l;
        C17110l c17110l = this.f8898l;
        c17110l.loadAd = c4369l;
        if (c17110l.yandex == this) {
            c17110l.yandex = null;
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C17110l c17110l = this.f8898l;
        c17110l.yandex = this;
        c17110l.loadAd = null;
        this.f8899l = null;
        c17110l.crashlytics = new C11029l(13, this);
        c17110l.amazon = m3914l();
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final InterfaceC2262l m1542l() {
        C4369l c4369lM1543l = m1543l();
        InterfaceC2262l interfaceC2262lM1542l = c4369lM1543l != null ? c4369lM1543l.m1542l() : null;
        if (interfaceC2262lM1542l != null && AbstractC11990l.smaato(interfaceC2262lM1542l)) {
            return interfaceC2262lM1542l;
        }
        InterfaceC2262l interfaceC2262l = this.f8898l.amazon;
        if (interfaceC2262l != null) {
            return interfaceC2262l;
        }
        C8339l.smaato("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: lَٖؕ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1110l(long r7, defpackage.InterfaceC14029l r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C2074l
            if (r0 == 0) goto L13
            r0 = r9
            lؓۙؐ r0 = (defpackage.C2074l) r0
            int r1 = r0.f4652l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4652l = r1
            goto L1a
        L13:
            lؓۙؐ r0 = new lؓۙؐ
            lّؑۧ r9 = (defpackage.AbstractC0283l) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f4653l
            int r1 = r0.f4652l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.f4654l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L35:
            long r7 = r0.f4654l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L53
        L3b:
            defpackage.AbstractC2829l.crashlytics(r9)
            boolean r9 = r6.f29462l
            if (r9 == 0) goto L46
            lۣؖۙ r2 = r6.m1543l()
        L46:
            if (r2 == 0) goto L58
            r0.f4654l = r7
            r0.f4652l = r4
            java.lang.Object r9 = r2.mo1110l(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            lِۛٚ r9 = (defpackage.C12121l) r9
            long r1 = r9.yandex
            goto L5a
        L58:
            r1 = 0
        L5a:
            lٍّۙ r6 = r6.f8900l
            long r7 = defpackage.C12121l.amazon(r7, r1)
            r0.f4654l = r1
            r0.f4652l = r3
            java.lang.Object r9 = r6.mo1110l(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            lِۛٚ r9 = (defpackage.C12121l) r9
            long r8 = r9.yandex
            long r6 = defpackage.C12121l.purchase(r6, r8)
            lِۛٚ r8 = new lِۛٚ
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4369l.mo1110l(long, lٌؚٓ):java.lang.Object");
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final C4369l m1543l() {
        C18289l c18289l;
        InterfaceC11189l interfaceC11189l = null;
        if (!this.f29462l) {
            return null;
        }
        if (!this.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l = this.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(this);
        loop0: while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 262144) != 0) {
                while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 262144) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                        C17893l c17893l = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof InterfaceC11189l) {
                                InterfaceC11189l interfaceC11189l2 = (InterfaceC11189l) abstractC14971lLoadAd;
                                if (AbstractC8576l.yandex(this.f8901l, interfaceC11189l2.adcel()) && C4369l.class == interfaceC11189l2.getClass()) {
                                    interfaceC11189l = interfaceC11189l2;
                                    break loop0;
                                }
                            }
                            if ((abstractC14971lLoadAd.f29450l & 262144) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i = 0;
                                for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                    if ((abstractC14971l2.f29450l & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC14971lLoadAd = abstractC14971l2;
                                        } else {
                                            if (c17893l == null) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l.crashlytics(abstractC14971l2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l = abstractC14971l.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        return (C4369l) interfaceC11189l;
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: return */
    public final long mo1111return(int i, long j, long j2) {
        long jMo1111return = this.f8900l.mo1111return(i, j, j2);
        C4369l c4369lM1543l = this.f29462l ? m1543l() : null;
        return C1187l.subs(jMo1111return, c4369lM1543l != null ? c4369lM1543l.mo1111return(i, C1187l.subs(j, jMo1111return), C1187l.admob(j2, jMo1111return)) : 0L);
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: switch */
    public final long mo1112switch(int i, long j) {
        C4369l c4369lM1543l = this.f29462l ? m1543l() : null;
        long jMo1112switch = c4369lM1543l != null ? c4369lM1543l.mo1112switch(i, j) : 0L;
        return C1187l.subs(jMo1112switch, this.f8900l.mo1112switch(i, C1187l.admob(j, jMo1112switch)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: throws */
    public final Object mo1113throws(long j, long j2, InterfaceC14029l interfaceC14029l) {
        C8908l c8908l;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (interfaceC14029l instanceof C8908l) {
            c8908l = (C8908l) interfaceC14029l;
            int i = c8908l.f18299l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8908l.f18299l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8908l = new C8908l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c8908l = new C8908l(this, (AbstractC0283l) interfaceC14029l);
        }
        C8908l c8908l2 = c8908l;
        Object objMo1113throws = c8908l2.f18302l;
        int i2 = c8908l2.f18299l;
        C4369l c4369lM1543l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objMo1113throws);
            InterfaceC12499l interfaceC12499l = this.f8900l;
            c8908l2.f18301l = j;
            c8908l2.f18300l = j2;
            c8908l2.f18299l = 1;
            objMo1113throws = interfaceC12499l.mo1113throws(j, j2, c8908l2);
            if (objMo1113throws != enumC9342l) {
                j3 = j;
                j4 = j2;
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            j4 = c8908l2.f18300l;
            j3 = c8908l2.f18301l;
            AbstractC2829l.crashlytics(objMo1113throws);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = c8908l2.f18301l;
            AbstractC2829l.crashlytics(objMo1113throws);
        }
        j6 = ((C12121l) objMo1113throws).yandex;
        j5 = j7;
        return new C12121l(C12121l.purchase(j5, j6));
        j5 = ((C12121l) objMo1113throws).yandex;
        boolean z = this.f29462l;
        if (!z) {
            c4369lM1543l = this.f8899l;
        } else if (z) {
            c4369lM1543l = m1543l();
        }
        if (c4369lM1543l != null) {
            long jPurchase = C12121l.purchase(j3, j5);
            long jAmazon = C12121l.amazon(j4, j5);
            c8908l2.f18301l = j5;
            c8908l2.f18299l = 2;
            objMo1113throws = c4369lM1543l.mo1113throws(jPurchase, jAmazon, c8908l2);
            if (objMo1113throws != enumC9342l) {
                j7 = j5;
                j6 = ((C12121l) objMo1113throws).yandex;
                j5 = j7;
            }
            return enumC9342l;
        }
        j6 = 0;
        return new C12121l(C12121l.purchase(j5, j6));
    }
}
