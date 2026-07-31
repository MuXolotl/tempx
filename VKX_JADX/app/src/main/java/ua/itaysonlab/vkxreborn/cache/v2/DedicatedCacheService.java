package ua.itaysonlab.vkxreborn.cache.v2;

import android.content.Intent;
import android.os.IBinder;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC0283l;
import defpackage.AbstractC0622l;
import defpackage.AbstractC0825l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11463l;
import defpackage.AbstractC11738l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC16377l;
import defpackage.AbstractC2829l;
import defpackage.AbstractC5921l;
import defpackage.AbstractC6025l;
import defpackage.AbstractServiceC5477l;
import defpackage.BinderC16641l;
import defpackage.C10424l;
import defpackage.C1158l;
import defpackage.C12418l;
import defpackage.C13624l;
import defpackage.C14025l;
import defpackage.C14951l;
import defpackage.C16552l;
import defpackage.C18731l;
import defpackage.C2347l;
import defpackage.C4425l;
import defpackage.C5268l;
import defpackage.C7989l;
import defpackage.C8084l;
import defpackage.C8339l;
import defpackage.C8490l;
import defpackage.EnumC8981l;
import defpackage.EnumC9342l;
import defpackage.ExecutorC6708l;
import defpackage.InterfaceC14029l;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DedicatedCacheService extends AbstractServiceC5477l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final /* synthetic */ int f36826l = 0;

    /* JADX WARN: Code duplicated, block: B:30:0x00af A[PHI: r0 r1 r3
  0x00af: PHI (r0v2 ua.itaysonlab.vkapi2.objects.music.AudioTrack) = 
  (r0v0 ua.itaysonlab.vkapi2.objects.music.AudioTrack)
  (r0v0 ua.itaysonlab.vkapi2.objects.music.AudioTrack)
  (r0v24 ua.itaysonlab.vkapi2.objects.music.AudioTrack)
 binds: [B:35:0x00da, B:28:0x00ab, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r1v4 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) = 
  (r1v3 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack)
  (r1v3 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack)
  (r1v6 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack)
 binds: [B:35:0x00da, B:28:0x00ab, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v4 java.lang.String), (r3v8 java.lang.String) binds: [B:35:0x00da, B:28:0x00ab, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112 A[PHI: r1 r3
  0x0112: PHI (r1v7 ua.itaysonlab.vkapi2.objects.music.AudioTrack) = (r1v5 ua.itaysonlab.vkapi2.objects.music.AudioTrack), (r1v8 ua.itaysonlab.vkapi2.objects.music.AudioTrack) binds: [B:44:0x00f4, B:49:0x0110] A[DONT_GENERATE, DONT_INLINE]
  0x0112: PHI (r3v9 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) = (r3v6 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack), (r3v10 ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) binds: [B:44:0x00f4, B:49:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r0, r2, r6) == r10) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object, lؘؘؔ, ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String, lٌؚٓ, ua.itaysonlab.vkxreborn.cache.realm.CachedTrack] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object isPro(ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService r20, ua.itaysonlab.vkapi2.objects.music.AudioTrack r21, defpackage.C6640l r22, defpackage.AbstractC0283l r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.isPro(ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService, ua.itaysonlab.vkapi2.objects.music.AudioTrack, lؙٟؗ, lّؑۧ):java.lang.Object");
    }

    public static Object smaato(C14025l c14025l, String str, boolean z, AbstractC0283l abstractC0283l) throws Throwable {
        if (str.length() == 0 || (!z && AbstractC5921l.f12465l.isVip(c14025l))) {
            return Unit.INSTANCE;
        }
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C7989l(c14025l, str, null), abstractC0283l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[Catch: Exception -> 0x0039, TryCatch #2 {Exception -> 0x0039, blocks: (B:14:0x0034, B:90:0x01e9, B:20:0x0042, B:83:0x01c6, B:87:0x01cc, B:42:0x00b0, B:44:0x00b6, B:46:0x00c5, B:48:0x00c8, B:64:0x0136, B:66:0x014f, B:67:0x016d, B:68:0x016e, B:70:0x0172, B:74:0x018b, B:80:0x01c1, B:77:0x01bc, B:31:0x0071, B:33:0x0075, B:35:0x007b, B:36:0x007d, B:38:0x0081, B:40:0x0087, B:41:0x008f), top: B:99:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: Exception -> 0x0039, TryCatch #2 {Exception -> 0x0039, blocks: (B:14:0x0034, B:90:0x01e9, B:20:0x0042, B:83:0x01c6, B:87:0x01cc, B:42:0x00b0, B:44:0x00b6, B:46:0x00c5, B:48:0x00c8, B:64:0x0136, B:66:0x014f, B:67:0x016d, B:68:0x016e, B:70:0x0172, B:74:0x018b, B:80:0x01c1, B:77:0x01bc, B:31:0x0071, B:33:0x0075, B:35:0x007b, B:36:0x007d, B:38:0x0081, B:40:0x0087, B:41:0x008f), top: B:99:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #2 {Exception -> 0x0039, blocks: (B:14:0x0034, B:90:0x01e9, B:20:0x0042, B:83:0x01c6, B:87:0x01cc, B:42:0x00b0, B:44:0x00b6, B:46:0x00c5, B:48:0x00c8, B:64:0x0136, B:66:0x014f, B:67:0x016d, B:68:0x016e, B:70:0x0172, B:74:0x018b, B:80:0x01c1, B:77:0x01bc, B:31:0x0071, B:33:0x0075, B:35:0x007b, B:36:0x007d, B:38:0x0081, B:40:0x0087, B:41:0x008f), top: B:99:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b A[Catch: Exception -> 0x0060, PHI: r3 r4 r5 r6 r8 r9 r11 r12 r13 r14 r15
  0x010b: PHI (r3v12 lٕؔٗ) = (r3v7 lٕؔٗ), (r3v2 lٕؔٗ) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r4v14 int) = (r4v11 int), (r4v16 int) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r5v13 lٕؔٗ) = (r5v7 lٕؔٗ), (r5v19 lٕؔٗ) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r6v8 java.util.Iterator) = (r6v5 java.util.Iterator), (r6v10 java.util.Iterator) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r8v12 lَُٖ) = (r8v8 lَُٖ), (r8v13 lَُٖ) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r9v11 lؚٜ٘) = (r9v7 lؚٜ٘), (r9v12 lؚٜ٘) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r11v5 ua.itaysonlab.vkapi2.objects.music.AudioTrack) = (r11v3 ua.itaysonlab.vkapi2.objects.music.AudioTrack), (r11v6 ua.itaysonlab.vkapi2.objects.music.AudioTrack) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r12v5 int) = (r12v3 int), (r12v6 int) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r13v3 int) = (r13v1 int), (r13v4 int) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r15v3 int) = (r15v1 int), (r15v4 int) binds: [B:52:0x0107, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:23:0x005b, B:54:0x010b, B:51:0x00dd), top: B:95:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0107 -> B:54:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:42:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractServiceC5477l
    public final java.lang.Object billing(defpackage.AbstractC7317l r18, defpackage.AbstractC0283l r19) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.billing(lؚٜ٘, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r6, r9, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object firebase(defpackage.C17685l r7, defpackage.InterfaceC11075l r8, defpackage.AbstractC0283l r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C17669l
            if (r0 == 0) goto L13
            r0 = r9
            lؙ٘ؕ r0 = (defpackage.C17669l) r0
            int r1 = r0.f34435l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34435l = r1
            goto L18
        L13:
            lؙ٘ؕ r0 = new lؙ٘ؕ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.f34438l
            int r9 = r0.f34435l
            r1 = 5
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r9 == 0) goto L3a
            if (r9 == r3) goto L32
            if (r9 != r2) goto L2c
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L70
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L32:
            lَُٖ r8 = r0.f34436l
            lّ٘ؖ r7 = r0.f34437l
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L5c
        L3a:
            defpackage.AbstractC2829l.crashlytics(r6)
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r6 = r7.purchase
            java.lang.String r6 = defpackage.AbstractC14770l.amazon(r6)
            if (r6 == 0) goto L5c
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r9 = r7.purchase
            java.lang.String r9 = defpackage.AbstractC14770l.vip(r9)
            lًٓۤ r9 = defpackage.AbstractC0825l.admob(r1, r9)
            r0.f34437l = r7
            r0.f34436l = r8
            r0.f34435l = r3
            java.lang.Object r6 = smaato(r9, r6, r3, r0)
            if (r6 != r5) goto L5c
            goto L6f
        L5c:
            lٖۖ r6 = defpackage.AbstractC11463l.yandex
            lۨؓ r9 = new lۨؓ
            r9.<init>(r8, r7, r4, r1)
            r0.f34437l = r4
            r0.f34436l = r4
            r0.f34435l = r2
            java.lang.Object r6 = defpackage.AbstractC10999l.firebase(r6, r9, r0)
            if (r6 != r5) goto L70
        L6f:
            return r5
        L70:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService.firebase(lّ٘ؖ, lَُٖ, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return new BinderC16641l();
    }

    @Override // defpackage.AbstractServiceC5477l, defpackage.AbstractServiceC4696l, android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC14029l interfaceC14029l = null;
        C13624l c13624l = new C13624l(this, interfaceC14029l, 17);
        C8490l c8490l = AbstractC6025l.yandex;
        C12418l c12418l = this.f9539l;
        C5268l c5268l = (C5268l) c12418l.f24519l;
        C8084l c8084l = AbstractC6025l.loadAd;
        C2347l c2347l = new C2347l(new C10424l(c8084l, 10), new C18731l(c13624l, interfaceC14029l, 7), 2);
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        C14951l c14951l = new C14951l(this, interfaceC14029l, 16);
        C5268l c5268l2 = (C5268l) c12418l.f24519l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 11), new C18731l(c14951l, interfaceC14029l, 9), 2), c5268l2, enumC8981l), AbstractC11738l.yandex(c5268l2));
    }

    @Override // defpackage.AbstractServiceC5477l
    public final AbstractC16377l purchase() {
        return new C4425l(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object remoteconfig(AudioTrack audioTrack, AbstractC0283l abstractC0283l) throws Throwable {
        C1158l c1158l;
        AlbumThumb albumThumb;
        if (abstractC0283l instanceof C1158l) {
            c1158l = (C1158l) abstractC0283l;
            int i = c1158l.f3137l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1158l.f3137l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1158l = new C1158l(this, abstractC0283l);
            }
        } else {
            c1158l = new C1158l(this, abstractC0283l);
        }
        Object obj = c1158l.f3136l;
        int i2 = c1158l.f3137l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            AudioAlbum audioAlbum = audioTrack.vip;
            if (audioAlbum != null && (albumThumb = audioAlbum.purchase) != null) {
                C14025l c14025lAdmob = AbstractC0825l.admob(4, audioAlbum.loadAd());
                String str = albumThumb.purchase;
                if (str == null && (str = albumThumb.amazon) == null && (str = albumThumb.crashlytics) == null) {
                    str = "";
                }
                if (!AbstractC5921l.f12465l.isVip(c14025lAdmob)) {
                    c1158l.f3137l = 1;
                    Object objSmaato = smaato(c14025lAdmob, str, false, c1158l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objSmaato == enumC9342l) {
                        return enumC9342l;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }
}
