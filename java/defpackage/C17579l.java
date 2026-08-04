package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* JADX INFO: renamed from: lٗۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17579l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f34215l;

    public C17579l(AbstractC9694l abstractC9694l) {
        this.f34215l = abstractC9694l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj2;
        AudioStreamMix.Link link = audioStreamMix.amazon;
        if (link == null || (str = link.loadAd) == null) {
            str = audioStreamMix.loadAd;
        }
        this.f34215l.Signature(new C3086l(6, str2, null, str, null), false);
        return Unit.INSTANCE;
    }
}
