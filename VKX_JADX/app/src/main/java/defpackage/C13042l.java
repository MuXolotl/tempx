package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState;

/* JADX INFO: renamed from: lْؐٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13042l implements InterfaceC17205l, InterfaceC2262l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C14025l f25548l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C14025l f25550l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f25551l = AbstractC11990l.loadAd();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C13042l f25547l = new C13042l();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C4910l f25546l = AbstractC8618l.yandex();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final AbstractC7188l f25549l = AbstractC9968l.yandex(VKXApplication.f36629l, AbstractC18202l.yandex(QueueSaveHolder$VkxMetadataState.class));

    static {
        String str = C14025l.f27330l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        C14025l c14025lAds = C6162l.ads(vKXApplication.getFilesDir());
        f25548l = c14025lAds.purchase("vkx_last_state2.json");
        f25550l = c14025lAds.purchase("vkx_metadata2.json");
    }

    public static C8195l crashlytics() {
        Object c18435l;
        Object c18435l2;
        Throwable th;
        Throwable th2;
        try {
            C1503l c1503l = new C1503l(AbstractC5921l.f12465l.mo692default(f25548l));
            try {
                C15913l c15913l = AbstractC8237l.amazon;
                c15913l.getClass();
                c18435l = (C0767l) AbstractC10802l.loadAd(c15913l, C0767l.Companion.serializer(), new C6309l(c1503l, 1));
                try {
                    c1503l.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c1503l.close();
                } catch (Throwable th5) {
                    AbstractC11718l.yandex(th4, th5);
                }
                th2 = th4;
                c18435l = null;
            }
            if (th2 != null) {
                throw th2;
            }
        } catch (Throwable th6) {
            c18435l = new C18435l(th6);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        C14025l c14025l = f25550l;
        if (thYandex != null) {
            AbstractC5921l.f12465l.adcel(c14025l, false);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        C0767l c0767l = (C0767l) c18435l;
        if (c0767l == null) {
            return null;
        }
        try {
            C12382l c12382l = AbstractC5921l.f12465l;
            C14025l c14025l2 = c12382l.isVip(c14025l) ? c14025l : null;
            if (c14025l2 != null) {
                C1503l c1503l2 = new C1503l(c12382l.mo692default(c14025l2));
                try {
                    c18435l2 = (QueueSaveHolder$VkxMetadataState) f25549l.yandex(c1503l2);
                    try {
                        c1503l2.close();
                        th = null;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    try {
                        c1503l2.close();
                    } catch (Throwable th9) {
                        AbstractC11718l.yandex(th8, th9);
                    }
                    th = th8;
                    c18435l2 = null;
                }
                if (th != null) {
                    throw th;
                }
            } else {
                c18435l2 = null;
            }
        } catch (Throwable th10) {
            c18435l2 = new C18435l(th10);
        }
        if (C1171l.yandex(c18435l2) != null) {
            AbstractC5921l.f12465l.adcel(c14025l, false);
        }
        return new C8195l(c0767l, (QueueSaveHolder$VkxMetadataState) (c18435l2 instanceof C18435l ? null : c18435l2));
    }

    public static boolean loadAd() {
        C10892l.yandex.getClass();
        return ((Boolean) C10892l.crashlytics.yandex()).booleanValue() && AbstractC5921l.f12465l.isVip(f25548l);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r3.firebase(r5, r0, r6, r7, r8) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        if (r0 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(defpackage.AbstractC0283l r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.C8517l
            if (r1 == 0) goto L18
            r1 = r0
            lٌْؓ r1 = (defpackage.C8517l) r1
            int r2 = r1.f17607l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f17607l = r2
            r2 = r18
        L16:
            r8 = r1
            goto L20
        L18:
            lٌْؓ r1 = new lٌْؓ
            r2 = r18
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r8.f17606l
            int r1 = r8.f17607l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L39
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            goto L34
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            return r5
        L34:
            defpackage.AbstractC2829l.crashlytics(r0)
            goto Laf
        L39:
            defpackage.AbstractC2829l.crashlytics(r0)
            boolean r0 = loadAd()
            if (r0 != 0) goto L45
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L45:
            lًۖٔ r0 = crashlytics()
            if (r0 != 0) goto L4e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4e:
            java.lang.Object r1 = r0.f17098l
            lؒؑؕ r1 = (defpackage.C0767l) r1
            lؕؒۧ r6 = r1.yandex
            boolean r7 = r6 instanceof defpackage.InterfaceC17817l
            if (r7 == 0) goto L5b
            lٍ٘ۢ r6 = (defpackage.InterfaceC17817l) r6
            goto L5c
        L5b:
            r6 = r5
        L5c:
            java.lang.Object r0 = r0.f17097l
            ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState r0 = (ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState) r0
            if (r6 == 0) goto Laf
            lِْٙ r7 = new lِْٙ
            lُؙٜ r1 = r1.loadAd
            java.lang.String r9 = r1.yandex
            if (r9 == 0) goto L70
            lُۡؔ r10 = new lُۡؔ
            r10.<init>(r9)
            goto L72
        L70:
            lؗؓۡ r10 = defpackage.C4618l.yandex
        L72:
            long r11 = r1.amazon
            r16 = 0
            r17 = 124(0x7c, float:1.74E-43)
            r13 = 0
            r14 = 0
            r15 = 0
            r9 = r7
            r9.<init>(r10, r11, r13, r14, r15, r16, r17)
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L9a
            lٕۦ۠ r3 = ua.itaysonlab.vkx.VKXApplication.f36632l
            if (r3 == 0) goto L88
            goto L89
        L88:
            r3 = r5
        L89:
            java.util.LinkedHashMap r5 = r0.yandex()
            java.util.List r0 = r0.yandex
            r8.f17607l = r4
            r4 = r5
            r5 = r0
            java.lang.Object r0 = r3.firebase(r4, r5, r6, r7, r8)
            if (r0 != r1) goto Laf
            goto Lae
        L9a:
            r8.f17607l = r3
            lٖۖ r0 = defpackage.AbstractC11463l.yandex
            lّۣؖ r4 = new lّۣؖ
            r4.<init>(r7, r6, r5, r3)
            java.lang.Object r0 = defpackage.AbstractC10999l.firebase(r0, r4, r8)
            if (r0 != r1) goto Laa
            goto Lac
        Laa:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        Lac:
            if (r0 != r1) goto Laf
        Lae:
            return r1
        Laf:
            r2.yandex()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13042l.amazon(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object purchase(C10507l c10507l, long j, InterfaceC17817l interfaceC17817l, AbstractC0283l abstractC0283l) throws Throwable {
        C13373l c13373l;
        InterfaceC1601l interfaceC1601l;
        long j2;
        InterfaceC3136l interfaceC3136l;
        int i;
        C10507l c10507l2;
        InterfaceC1601l interfaceC1601l2;
        if (abstractC0283l instanceof C13373l) {
            c13373l = (C13373l) abstractC0283l;
            int i2 = c13373l.f26244l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13373l.f26244l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13373l = new C13373l(this, abstractC0283l);
            }
        } else {
            c13373l = new C13373l(this, abstractC0283l);
        }
        Object objFirebase = c13373l.f26242l;
        int i3 = c13373l.f26244l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(objFirebase);
                C10892l.yandex.getClass();
                if (!((Boolean) C10892l.crashlytics.yandex()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                InterfaceC3136l interfaceC3136l2 = interfaceC17817l instanceof InterfaceC3136l ? (InterfaceC3136l) interfaceC17817l : null;
                if (interfaceC3136l2 == null) {
                    return Unit.INSTANCE;
                }
                if (interfaceC3136l2 instanceof InterfaceC2841l) {
                    return Unit.INSTANCE;
                }
                c13373l.f26241l = c10507l;
                c13373l.f26240l = interfaceC3136l2;
                interfaceC1601l = f25546l;
                c13373l.f26243l = interfaceC1601l;
                j2 = j;
                c13373l.f26237l = j2;
                c13373l.f26238l = 0;
                c13373l.f26244l = 1;
                if (interfaceC1601l.yandex(c13373l) != enumC9342l) {
                    interfaceC3136l = interfaceC3136l2;
                    i = 0;
                    c10507l2 = c10507l;
                }
                return enumC9342l;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1601l2 = c13373l.f26243l;
                try {
                    AbstractC2829l.crashlytics(objFirebase);
                    ((C1171l) objFirebase).getClass();
                    interfaceC1601l2.billing(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            i = c13373l.f26238l;
            j2 = c13373l.f26237l;
            interfaceC1601l = c13373l.f26243l;
            interfaceC3136l = c13373l.f26240l;
            c10507l2 = c13373l.f26241l;
            AbstractC2829l.crashlytics(objFirebase);
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C17268l c17268l = new C17268l(c10507l2, interfaceC3136l, j2, null);
            c13373l.f26241l = null;
            c13373l.f26240l = null;
            c13373l.f26243l = interfaceC1601l;
            c13373l.f26237l = j2;
            c13373l.f26238l = i;
            c13373l.f26244l = 2;
            objFirebase = AbstractC10999l.firebase(executorC6708l, c17268l, c13373l);
            if (objFirebase != enumC9342l) {
                interfaceC1601l2 = interfaceC1601l;
                ((C1171l) objFirebase).getClass();
                interfaceC1601l2.billing(null);
                return Unit.INSTANCE;
            }
            return enumC9342l;
        } catch (Throwable th2) {
            th = th2;
            interfaceC1601l2 = interfaceC1601l;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f25551l.f36440l;
    }

    public final void yandex() {
        C12382l c12382l = AbstractC5921l.f12465l;
        c12382l.adcel(f25548l, false);
        c12382l.adcel(f25550l, false);
    }
}
