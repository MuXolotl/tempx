package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14187l extends C6731l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final InterfaceC12932l f27778l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C1770l f27779l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C2993l f27780l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC12932l f27781l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final String f27782l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C0059l f27783l;

    public C14187l(C10038l c10038l, boolean z, C1770l c1770l, InterfaceC12932l interfaceC12932l, C0059l c0059l) {
        super(z, c10038l);
        this.f27782l = "";
        this.f27779l = c1770l;
        this.f27781l = interfaceC12932l;
        this.f27783l = c0059l;
        C2993l c2993l = new C2993l((InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l));
        this.f27780l = c2993l;
        this.f27778l = interfaceC12932l.mo246l(c2993l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startapp(AbstractC0283l abstractC0283l) throws Exception {
        C10079l c10079l;
        Object objBilling;
        if (abstractC0283l instanceof C10079l) {
            c10079l = (C10079l) abstractC0283l;
            int i = c10079l.f20554l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10079l.f20554l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10079l = new C10079l(this, abstractC0283l);
            }
        } else {
            c10079l = new C10079l(this, abstractC0283l);
        }
        Object obj = c10079l.f20553l;
        int i2 = c10079l.f20554l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c10079l.f20554l = 1;
            Object objAmazon = AbstractC11174l.amazon(this.f27780l, c10079l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        for (C11911l c11911l : AbstractC0007l.crashlytics(this).amazon()) {
            C17535l c17535l = (C17535l) this.f21511l.billing(AbstractC0007l.yandex);
            if (c17535l != null && (objBilling = c17535l.billing(c11911l)) != null) {
                if (objBilling instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) objBilling;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        AbstractC14238l.subscription((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            C11983l.crashlytics();
                            return null;
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
                c17535l.purchase().remove(c11911l);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f27778l;
    }
}
