package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioPlaylistSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lؙّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0889l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f2542l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2543l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2544l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ int f2545l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0889l(AudioPlaylist audioPlaylist, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f2542l = audioPlaylist;
        this.f2543l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2545l;
        int i2 = this.f2544l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            AudioPlaylist audioPlaylist = this.f2542l;
            C11444l c11444l = new C11444l(audioPlaylist.crashlytics, i, this.f2543l, audioPlaylist.amazon, audioPlaylist.pro);
            this.f2545l = i;
            this.f2544l = 1;
            obj = c11444l.subs(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        Iterable<AudioPlaylistSnippetEntry> iterable = (List) ((VKResponseWithItems) obj).yandex;
        if (iterable == null) {
            iterable = C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        for (AudioPlaylistSnippetEntry audioPlaylistSnippetEntry : iterable) {
            AudioTrack audioTrack = audioPlaylistSnippetEntry.yandex;
            AudioPlaylistSnippetEntry.StreamUrl streamUrl = audioPlaylistSnippetEntry.loadAd;
            arrayList.add(new AudioSnippetEntry("_playlist_mix", null, null, null, null, AbstractC0441l.admob().yandex(), Collections.singletonList(AudioTrack.Signature(audioTrack, streamUrl.yandex, null, null, null, (streamUrl.crashlytics - streamUrl.loadAd) / 1000, -67109377, 7)), Collections.singletonList(AbstractC16676l.billing(audioPlaylistSnippetEntry.yandex)), 30));
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C0889l c0889l = new C0889l(this.f2542l, this.f2543l, interfaceC14029l);
        c0889l.f2545l = ((Number) obj).intValue();
        return c0889l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0889l) ads((InterfaceC14029l) obj2, Integer.valueOf(((Number) obj).intValue()))).Signature(Unit.INSTANCE);
    }
}
