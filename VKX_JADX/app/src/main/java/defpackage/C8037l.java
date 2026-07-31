package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8037l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f16730l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ String f16731l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f16732l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C9231l f16733l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f16734l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8037l(int i, long j, String str, C9231l c9231l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16734l = i;
        this.f16730l = j;
        this.f16731l = str;
        this.f16733l = c9231l;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r0, r3, r13) == r6) goto L24;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f16732l
            lٌۨۚ r1 = r13.f16733l
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L73
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r13)
            return r5
        L1c:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L51
        L20:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L3d
        L24:
            defpackage.AbstractC2829l.crashlytics(r14)
            lٖٞٔ r7 = new lٖٞٔ
            java.lang.String r11 = r13.f16731l
            java.util.List r12 = r1.f18987l
            int r8 = r13.f16734l
            long r9 = r13.f16730l
            r7.<init>(r8, r9, r11, r12)
            r13.f16732l = r4
            java.lang.Object r14 = r7.ads(r13)
            if (r14 != r6) goto L3d
            goto L72
        L3d:
            lٖٞٔ r14 = new lٖٞٔ
            int r0 = r13.f16734l
            java.lang.String r4 = r13.f16731l
            long r7 = r13.f16730l
            r14.<init>(r7, r0, r4)
            r13.f16732l = r3
            java.lang.Object r14 = defpackage.AbstractC8189l.admob(r14, r13)
            if (r14 != r6) goto L51
            goto L72
        L51:
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r14 = (ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist) r14
            lٌٔ r0 = new lٌٔ
            r0.<init>(r14)
            ua.itaysonlab.vkx.VKXApplication r3 = ua.itaysonlab.vkx.VKXApplication.f36631l
            if (r3 == 0) goto L5d
            goto L5e
        L5d:
            r3 = r5
        L5e:
            defpackage.AbstractC12832l.mopub(r0, r3)
            lٖۖ r0 = defpackage.AbstractC11463l.yandex
            lؔۢؒ r0 = defpackage.AbstractC17278l.yandex
            lٗ۠ۤ r3 = new lٗ۠ۤ
            r3.<init>(r1, r14, r5)
            r13.f16732l = r2
            java.lang.Object r13 = defpackage.AbstractC10999l.firebase(r0, r3, r13)
            if (r13 != r6) goto L73
        L72:
            return r6
        L73:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8037l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C8037l(this.f16734l, this.f16730l, this.f16731l, this.f16733l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8037l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
