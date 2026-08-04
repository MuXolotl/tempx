package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌٚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8884l extends AbstractC5097l {

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final /* synthetic */ int f18248l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f18249l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f18250l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f18251l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C1008l f18252l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final EnumC8514l f18253l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f18254l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C17584l f18255l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f18256l;

    public C8884l(C17584l c17584l, EnumC8514l enumC8514l) {
        List list;
        C0247l c0247l;
        super(false, 3);
        this.f18255l = c17584l;
        this.f18253l = enumC8514l;
        this.f18251l = AbstractC8020l.smaato(Boolean.FALSE);
        C16287l.yandex.getClass();
        long jCrashlytics = C16287l.crashlytics();
        String strAmazon = C16287l.amazon();
        C7644l c7644l = VKXApplication.f36633l;
        this.f18250l = AbstractC8020l.smaato(new C4964l(jCrashlytics, ((C4645l) (c7644l == null ? null : c7644l).f15735l).isPro, strAmazon));
        this.f18249l = AbstractC8020l.smaato(EnumC13824l.f26964l);
        this.f18256l = AbstractC8020l.smaato((c17584l == null || (list = c17584l.f34229l) == null || (c0247l = (C0247l) AbstractC16901l.m4217extends(list)) == null) ? new C0247l("", "", "", false, false, false, 0, C3844l.f7950l) : c0247l);
        this.f18252l = AbstractC11190l.yandex("");
        this.f18254l = AbstractC8020l.smaato(C14296l.yandex);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r10 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object pro(defpackage.C8884l r8, java.lang.String r9, defpackage.AbstractC0283l r10) {
        /*
            boolean r0 = r10 instanceof defpackage.C7672l
            if (r0 == 0) goto L13
            r0 = r10
            lؚۨؔ r0 = (defpackage.C7672l) r0
            int r1 = r0.f16095l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16095l = r1
            goto L18
        L13:
            lؚۨؔ r0 = new lؚۨؔ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f16096l
            int r1 = r0.f16095l
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Throwable -> L96
            goto L85
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            r8 = 0
            return r8
        L31:
            int r8 = r0.f16097l
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Throwable -> L96
            goto L62
        L37:
            defpackage.AbstractC2829l.crashlytics(r10)
            lًؓٙ r10 = defpackage.C7743l.yandex     // Catch: java.lang.Throwable -> L96
            lََؖ r8 = r8.f18254l     // Catch: java.lang.Throwable -> L96
            r8.setValue(r10)     // Catch: java.lang.Throwable -> L96
            lؚۥۤ r8 = defpackage.AbstractC16584l.loadAd()     // Catch: java.lang.Throwable -> L96
            r10 = 0
            r0.f16097l = r10     // Catch: java.lang.Throwable -> L96
            r0.f16095l = r3     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "utils.resolveScreenName"
            lٗۡؑ r3 = new lٗۡؑ     // Catch: java.lang.Throwable -> L96
            lؚۘٔ r5 = defpackage.C7472l.f15458l     // Catch: java.lang.Throwable -> L96
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "screen_name"
            r3.yandex(r1, r9)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.billing(r3, r0)     // Catch: java.lang.Throwable -> L96
            if (r8 != r4) goto L5f
            goto L84
        L5f:
            r7 = r10
            r10 = r8
            r8 = r7
        L62:
            lٍٓٚ r10 = (defpackage.AbstractC14237l) r10     // Catch: java.lang.Throwable -> L96
            java.lang.Object r9 = defpackage.AbstractC10802l.subs(r10)     // Catch: java.lang.Throwable -> L96
            lؙٕٖ r9 = (defpackage.C6483l) r9     // Catch: java.lang.Throwable -> L96
            java.lang.String r10 = r9.loadAd     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "user"
            boolean r10 = defpackage.AbstractC8576l.yandex(r10, r1)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L93
            lؚۥۤ r10 = defpackage.AbstractC16584l.loadAd()     // Catch: java.lang.Throwable -> L96
            long r5 = r9.yandex     // Catch: java.lang.Throwable -> L96
            r0.f16097l = r8     // Catch: java.lang.Throwable -> L96
            r0.f16095l = r2     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = defpackage.AbstractC13095l.license(r10, r5, r0)     // Catch: java.lang.Throwable -> L96
            if (r10 != r4) goto L85
        L84:
            return r4
        L85:
            lٍٓٚ r10 = (defpackage.AbstractC14237l) r10     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = defpackage.AbstractC10802l.subs(r10)     // Catch: java.lang.Throwable -> L96
            lؗ٘ۢ r8 = (defpackage.C4964l) r8     // Catch: java.lang.Throwable -> L96
            lؗ۟ٙ r9 = new lؗ۟ٙ     // Catch: java.lang.Throwable -> L96
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L96
            goto L9c
        L93:
            lًؘۗ r9 = defpackage.C5896l.yandex     // Catch: java.lang.Throwable -> L96
            goto L9c
        L96:
            r8 = move-exception
            lٛۤ r9 = new lٛۤ
            r9.<init>(r8)
        L9c:
            java.lang.Throwable r8 = defpackage.C1171l.yandex(r9)
            if (r8 != 0) goto La3
            goto La5
        La3:
            lؙٗۙ r9 = defpackage.C6521l.yandex
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8884l.pro(lٌٚؗ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    public final void ad(EnumC13824l enumC13824l) {
        this.f18249l.setValue(enumC13824l);
    }

    @Override // defpackage.AbstractC2338l
    public final void isPro() {
        super.isPro();
        AbstractC10999l.mopub(AbstractC11738l.yandex(this.f5077l), null, 0, new C4019l(this, null, 1), 3);
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1475729400);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        boolean z = false;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            C10086l c10086l = this.f18251l;
            boolean zBooleanValue = ((Boolean) c10086l.getValue()).booleanValue();
            C10086l c10086l2 = this.f18250l;
            boolean zMopub = c6956l.mopub(zBooleanValue) | c6956l.billing((C4964l) c10086l2.getValue());
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zMopub || objM2132native == c13863l) {
                long j = ((C4964l) c10086l2.getValue()).yandex;
                C16287l.yandex.getClass();
                if (j == C16287l.crashlytics() && ((Boolean) c10086l.getValue()).booleanValue()) {
                    z = true;
                }
                objM2132native = Boolean.valueOf(z);
                c6956l.m2147try(objM2132native);
            }
            boolean zBooleanValue2 = ((Boolean) objM2132native).booleanValue();
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C14019l(this, null, 20);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(18925885, new C10994l(this, iAdmob, zBooleanValue2, i2), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1645l(this, i, 15);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void subs() {
        C10086l c10086l = this.f18249l;
        if (((EnumC13824l) c10086l.getValue()) == EnumC13824l.f26962l || ((EnumC13824l) c10086l.getValue()) == EnumC13824l.f26963l) {
            ad(EnumC13824l.f26964l);
        } else {
            super.subs();
        }
    }
}
