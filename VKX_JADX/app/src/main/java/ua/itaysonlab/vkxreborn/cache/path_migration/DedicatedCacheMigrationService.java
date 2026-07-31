package ua.itaysonlab.vkxreborn.cache.path_migration;

import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC0622l;
import defpackage.AbstractC11738l;
import defpackage.AbstractC14024l;
import defpackage.AbstractC6025l;
import defpackage.AbstractServiceC4696l;
import defpackage.BinderC16641l;
import defpackage.C10424l;
import defpackage.C12418l;
import defpackage.C13624l;
import defpackage.C13802l;
import defpackage.C14951l;
import defpackage.C18731l;
import defpackage.C2347l;
import defpackage.C3600l;
import defpackage.C5268l;
import defpackage.C8084l;
import defpackage.C8490l;
import defpackage.C8688l;
import defpackage.EnumC8981l;
import defpackage.InterfaceC14029l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DedicatedCacheMigrationService extends AbstractServiceC4696l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ int f36651l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f36652l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8688l f36653l = new C8688l(new C13802l(22, this));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C3600l f36654l;

    /* JADX WARN: Code duplicated, block: B:27:0x0101 A[PHI: r1 r5 r12 r13 r14 r15
  0x0101: PHI (r1v3 lًٓۤ) = (r1v2 lًٓۤ), (r1v2 lًٓۤ), (r1v13 lًٓۤ) binds: [B:23:0x00e0, B:25:0x00fd, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r5v5 lًٓۤ) = (r5v4 lًٓۤ), (r5v4 lًٓۤ), (r5v9 lًٓۤ) binds: [B:23:0x00e0, B:25:0x00fd, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r12v7 lًٓۤ) = (r12v6 lًٓۤ), (r12v6 lًٓۤ), (r12v12 lًٓۤ) binds: [B:23:0x00e0, B:25:0x00fd, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r13v4 lًٓۤ) = (r13v3 lًٓۤ), (r13v3 lًٓۤ), (r13v6 lًٓۤ) binds: [B:23:0x00e0, B:25:0x00fd, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r14v7 lًؑؕ) = (r14v6 lًؑؕ), (r14v6 lًؑؕ), (r14v9 lًؑؕ) binds: [B:23:0x00e0, B:25:0x00fd, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r15v4 lًؑؕ) = (r15v3 lًؑؕ), (r15v3 lًؑؕ), (r15v6 lًؑؕ) binds: [B:23:0x00e0, B:25:0x00fd, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0119  */
    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b4, code lost:
    
        if (defpackage.AbstractC6025l.yandex(r0, r4) == r11) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object crashlytics(ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService r17, defpackage.AbstractC0085l r18, defpackage.AbstractC0085l r19, defpackage.AbstractC0283l r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService.crashlytics(ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService, lًؑؕ, lًؑؕ, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return new BinderC16641l();
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC14029l interfaceC14029l = null;
        C13624l c13624l = new C13624l(this, interfaceC14029l, 16);
        C8490l c8490l = AbstractC6025l.yandex;
        C12418l c12418l = this.f9539l;
        C5268l c5268l = (C5268l) c12418l.f24519l;
        C8084l c8084l = AbstractC6025l.loadAd;
        C2347l c2347l = new C2347l(new C10424l(c8084l, 8), new C18731l(c13624l, null), 2);
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        C14951l c14951l = new C14951l(this, interfaceC14029l, 15);
        C5268l c5268l2 = (C5268l) c12418l.f24519l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 9), new C18731l(c14951l, interfaceC14029l, 3), 2), c5268l2, enumC8981l), AbstractC11738l.yandex(c5268l2));
    }
}
