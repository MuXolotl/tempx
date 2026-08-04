package ua.itaysonlab.vkapi2.methods.execute;

import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/execute/SearchInProfile$SearchResponse", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class SearchInProfile$SearchResponse {
    public final List loadAd;
    public final SearchInProfile$SearchPlaylistResponse yandex;

    public SearchInProfile$SearchResponse(SearchInProfile$SearchPlaylistResponse searchInProfile$SearchPlaylistResponse, List list) {
        this.yandex = searchInProfile$SearchPlaylistResponse;
        this.loadAd = list;
    }
}
