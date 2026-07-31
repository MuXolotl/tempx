package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import defpackage.AbstractC11043l;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ResourceProvider {
    public static final Map yandex;

    static {
        HashMap map = new HashMap();
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_small_icon, map, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_pause, map, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_skip_next, map, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_forward, map, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_forward30, map, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_rewind10, map, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        AbstractC11043l.firebase(R.drawable.cast_ic_notification_disconnect, map, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        AbstractC11043l.firebase(R.string.cast_casting_to_device, map, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        AbstractC11043l.firebase(R.string.cast_pause, map, "pauseStringResId", R.string.cast_play, "playStringResId");
        AbstractC11043l.firebase(R.string.cast_skip_next, map, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        AbstractC11043l.firebase(R.string.cast_forward, map, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        AbstractC11043l.firebase(R.string.cast_forward_30, map, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        AbstractC11043l.firebase(R.string.cast_rewind_10, map, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
        map.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        yandex = DesugarCollections.unmodifiableMap(map);
    }

    @Keep
    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) yandex.get(str);
    }
}
