package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lٍٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14607l extends ClickableSpan {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC12494l f28603l;

    public C14607l(AbstractC12494l abstractC12494l) {
        this.f28603l = abstractC12494l;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C15263l c15263lYandex = this.f28603l.yandex();
        if (c15263lYandex != null) {
            ((C8250l) c15263lYandex.f29858l).invoke((MainArtist) c15263lYandex.f29857l);
        }
    }
}
