package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lَؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3312l extends AbstractC5518l {
    public static final /* synthetic */ int Signature = 0;
    public static final long subscription = AbstractC9027l.yandex(100.0f, 100.0f);
    public static final long tapsense = AbstractC9027l.yandex(200.0f, 200.0f);
    public final C18698l adcel = new C18698l(AbstractC8669l.m2407import(new C2261l[]{new C2261l(subscription), new C2261l(tapsense)}));
    public final C15656l ads = C15656l.amazon;

    @Override // defpackage.AbstractC5518l
    public final C15656l billing() {
        return this.ads;
    }

    public final void firebase(Bitmap bitmap, long j, C3259l c3259l, C6956l c6956l, int i) {
        c6956l.m2133new(-305850540);
        int i2 = i | (c6956l.admob(bitmap) ? 4 : 2) | (c6956l.purchase(j) ? 32 : 16) | (c6956l.admob(c3259l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C14218l c14218lRemoteconfig = AbstractC17307l.remoteconfig(AbstractC13542l.loadAd);
            AbstractC7370l.yandex(AbstractC5573l.purchase(new C1491l(c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig)), AbstractC14566l.amazon(1134109982, new C6224l(bitmap, c3259l, j, 1), c6956l), c6956l, 3072);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8763l(this, bitmap, j, c3259l, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5518l
    public final void mopub(Context context, C3445l c3445l, AbstractC0283l abstractC0283l) {
        C9043l c9043l;
        if (abstractC0283l instanceof C9043l) {
            c9043l = (C9043l) abstractC0283l;
            int i = c9043l.f18622l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9043l.f18622l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9043l = new C9043l(this, abstractC0283l);
            }
        } else {
            c9043l = new C9043l(this, abstractC0283l);
        }
        Object obj = c9043l.f18621l;
        int i2 = c9043l.f18622l;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C15578l c15578l = new C15578l(-443266785, true, new C10848l(new C15184l(new Intent("ua.itaysonlab.vkx.action.OPEN_PLAYER").setClass(context, AppActivity.class), AbstractC1760l.loadAd((AbstractC1484l[]) Arrays.copyOf(new AbstractC1484l[0], 0))), this, i3));
            c9043l.f18622l = 1;
            AbstractC17185l.purchase(c15578l, c9043l);
            return;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC2829l.crashlytics(obj);
            C17132l.firebase();
        }
    }

    @Override // defpackage.AbstractC5518l
    public final InterfaceC18579l purchase() {
        return this.adcel;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af A[Catch: all -> 0x011e, TryCatch #0 {all -> 0x011e, blocks: (B:14:0x003d, B:32:0x00a9, B:34:0x00af, B:38:0x00f7, B:43:0x011b, B:20:0x005f, B:24:0x0075, B:31:0x00a1, B:27:0x0083), top: B:52:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0112 -> B:16:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object remoteconfig(android.content.Context r24, kotlin.jvm.functions.Function1 r25, defpackage.AbstractC0283l r26) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3312l.remoteconfig(android.content.Context, kotlin.jvm.functions.Function1, lّؑۧ):java.lang.Object");
    }

    public final void smaato(Bitmap bitmap, long j, C3259l c3259l, C6956l c6956l, int i) {
        c6956l.m2133new(1751065376);
        int i2 = i | (c6956l.admob(bitmap) ? 4 : 2) | (c6956l.purchase(j) ? 32 : 16) | (c6956l.admob(c3259l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C14218l c14218lRemoteconfig = AbstractC17307l.remoteconfig(AbstractC13542l.loadAd);
            AbstractC3872l.yandex(AbstractC5573l.billing(new C1491l(c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig)), 0, AbstractC14566l.amazon(-269004228, new C6224l(bitmap, c3259l, j, 0), c6956l), c6956l, 3072, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8763l(this, bitmap, j, c3259l, i, 0);
        }
    }
}
