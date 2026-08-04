package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٍؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2516l extends MediaController.Callback {
    public final WeakReference yandex;

    public C2516l(C17977l c17977l) {
        this.yandex = new WeakReference(c17977l);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l == null || playbackInfo == null) {
            return;
        }
        int playbackType = playbackInfo.getPlaybackType();
        String volumeControlId = Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null;
        boolean z = true;
        if (playbackType == 1 && volumeControlId != null) {
            z = false;
        }
        AbstractC12442l.admob(z);
        C13052l c13052l = new C13052l(playbackType, C13736l.loadAd(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), volumeControlId);
        C0188l c0188l = c17977l.purchase;
        C5908l c5908l = c0188l.vip;
        c0188l.vip = new C5908l(c13052l, (C16830l) c5908l.f12458l, (C8937l) c5908l.f12457l, (List) c5908l.f12459l, (CharSequence) c5908l.f12453l, c5908l.f12456l, c5908l.f12455l, (Bundle) c5908l.f12454l);
        c17977l.purchase();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l != null) {
            C0188l c0188l = c17977l.purchase;
            if (bundleStartapp == null) {
                bundleStartapp = new Bundle();
            }
            Bundle bundle2 = bundleStartapp;
            C5908l c5908l = c0188l.vip;
            c0188l.vip = new C5908l((C13052l) c5908l.f12452l, (C16830l) c5908l.f12458l, (C8937l) c5908l.f12457l, (List) c5908l.f12459l, (CharSequence) c5908l.f12453l, c5908l.f12456l, c5908l.f12455l, bundle2);
            c0188l.metrica = true;
            c17977l.purchase();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        C8937l c8937lCreateFromParcel;
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l != null) {
            C11154l c11154l = C8937l.f18407l;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                c8937lCreateFromParcel = C8937l.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                c8937lCreateFromParcel.f18409l = mediaMetadata;
            } else {
                c8937lCreateFromParcel = null;
            }
            C8937l c8937l = c8937lCreateFromParcel;
            C0188l c0188l = c17977l.purchase;
            C5908l c5908l = c0188l.vip;
            c0188l.vip = new C5908l((C13052l) c5908l.f12452l, (C16830l) c5908l.f12458l, c8937l, (List) c5908l.f12459l, (CharSequence) c5908l.f12453l, c5908l.f12456l, c5908l.f12455l, (Bundle) c5908l.f12454l);
            c17977l.purchase();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l == null || c17977l.crashlytics != null) {
            return;
        }
        c17977l.loadAd(C16830l.yandex(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l != null) {
            ArrayList arrayListYandex = C10517l.yandex(list);
            C0188l c0188l = c17977l.purchase;
            C5908l c5908l = c0188l.vip;
            c0188l.vip = new C5908l((C13052l) c5908l.f12452l, (C16830l) c5908l.f12458l, (C8937l) c5908l.f12457l, C0188l.m288l(arrayListYandex), (CharSequence) c5908l.f12453l, c5908l.f12456l, c5908l.f12455l, (Bundle) c5908l.f12454l);
            c17977l.purchase();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l != null) {
            C0188l c0188l = c17977l.purchase;
            C5908l c5908l = c0188l.vip;
            c0188l.vip = new C5908l((C13052l) c5908l.f12452l, (C16830l) c5908l.f12458l, (C8937l) c5908l.f12457l, (List) c5908l.f12459l, charSequence, c5908l.f12456l, c5908l.f12455l, (Bundle) c5908l.f12454l);
            c17977l.purchase();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l != null) {
            c17977l.purchase.loadAd.release();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle);
        C17977l c17977l = (C17977l) this.yandex.get();
        if (c17977l != null) {
            C16811l c16811l = c17977l.purchase.loadAd;
            if (str == null) {
                return;
            }
            if (bundleStartapp == null) {
                bundleStartapp = Bundle.EMPTY;
            }
            c16811l.getClass();
            AbstractC12442l.subscription(Looper.myLooper() == c16811l.f32839l.getLooper());
            c16811l.f32840l.subscription(c16811l, new C12417l(str, bundleStartapp), bundleStartapp);
        }
    }
}
