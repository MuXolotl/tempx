package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4021l extends ViewOutlineProvider {
    public final float yandex = 8.0f;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        VKXApplication.Companion companion = VKXApplication.f36628l;
        outline.setRoundRect(0, 0, width, height, VKXApplication.Companion.yandex(this.yandex));
    }
}
