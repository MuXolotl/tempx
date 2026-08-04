package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: renamed from: lٌٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17240l implements InterfaceC4326l, InterfaceC7059l {
    public Object loadAd;
    public final /* synthetic */ int yandex;

    public C17240l(int i) {
        this.yandex = i;
        switch (i) {
            case 3:
                this.loadAd = AbstractC8020l.smaato(Boolean.FALSE);
                break;
            default:
                this.loadAd = LogSessionId.LOG_SESSION_ID_NONE;
                break;
        }
    }

    public void admob(LogSessionId logSessionId) {
        AbstractC12442l.subscription(((LogSessionId) this.loadAd).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.loadAd = logSessionId;
    }

    @Override // defpackage.InterfaceC7059l
    public int amazon() {
        return ((ContentInfo) this.loadAd).getFlags();
    }

    @Override // defpackage.InterfaceC7059l
    public int billing() {
        return ((ContentInfo) this.loadAd).getSource();
    }

    @Override // defpackage.InterfaceC4326l
    public C16242l build() {
        return new C16242l(new C17240l(((ContentInfo.Builder) this.loadAd).build()));
    }

    @Override // defpackage.InterfaceC4326l
    public void crashlytics(int i) {
        ((ContentInfo.Builder) this.loadAd).setFlags(i);
    }

    @Override // defpackage.InterfaceC4326l
    public void loadAd(Uri uri) {
        ((ContentInfo.Builder) this.loadAd).setLinkUri(uri);
    }

    public void mopub(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C18483l c18483l, InterfaceC12932l interfaceC12932l, Consumer consumer) {
        C17893l c17893l = new C17893l(0, new C0198l[16]);
        AbstractC3461l.vip(c18483l.yandex(), 0, new C0382l(1, c17893l, C17893l.class, "add", "add(Ljava/lang/Object;)Z", 8, 2));
        Arrays.sort(c17893l.f34848l, 0, c17893l.f34846l, AbstractC2920l.loadAd(C16274l.f31858l, C16274l.f31868l));
        int i = c17893l.f34846l;
        C0198l c0198l = (C0198l) (i == 0 ? null : c17893l.f34848l[i - 1]);
        if (c0198l == null) {
            return;
        }
        C16918l c16918l = c0198l.crashlytics;
        ScrollCaptureCallbackC6465l scrollCaptureCallbackC6465l = new ScrollCaptureCallbackC6465l(c0198l.yandex, c16918l, AbstractC11990l.yandex(interfaceC12932l), this, viewTreeObserverOnGlobalLayoutListenerC13840l);
        AbstractC18026l abstractC18026l = c0198l.amazon;
        C8896l c8896lMo2592synchronized = AbstractC9690l.crashlytics(abstractC18026l).mo2592synchronized(abstractC18026l, true);
        long jCrashlytics = c16918l.crashlytics();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC13840l, AbstractC5833l.isPro(AbstractC14231l.subs(c8896lMo2592synchronized)), new Point((int) (jCrashlytics >> 32), (int) (jCrashlytics & 4294967295L)), scrollCaptureCallbackC6465l);
        scrollCaptureTarget.setScrollBounds(AbstractC5833l.isPro(c16918l));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // defpackage.InterfaceC7059l
    public ContentInfo purchase() {
        return (ContentInfo) this.loadAd;
    }

    @Override // defpackage.InterfaceC4326l
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.loadAd).setExtras(bundle);
    }

    public String toString() {
        switch (this.yandex) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.loadAd) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC7059l
    public ClipData yandex() {
        return ((ContentInfo) this.loadAd).getClip();
    }

    public C17240l(ContentInfo contentInfo) {
        this.yandex = 1;
        contentInfo.getClass();
        this.loadAd = contentInfo;
    }

    public C17240l(ClipData clipData, int i) {
        this.yandex = 0;
        this.loadAd = AbstractC16491l.amazon(clipData, i);
    }
}
