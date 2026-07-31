package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.ArtistInfo;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3914l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ArtistInfo.Chip f8078l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f8079l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f8080l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ List f8081l;

    public C3914l(Function0 function0, Context context, ArtistInfo.Chip chip, List list) {
        this.f8080l = function0;
        this.f8079l = context;
        this.f8078l = chip;
        this.f8081l = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        InterfaceC1982l interfaceC1982l = (InterfaceC1982l) this.f8080l.invoke();
        ArtistInfo.Chip chip = this.f8078l;
        Catalog2ButtonAction catalog2ButtonAction = chip.yandex;
        if (catalog2ButtonAction instanceof C0146l) {
            Iterator it = this.f8081l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC8576l.yandex(((Catalog2Button) next).yandex, C9588l.yandex));
            Catalog2Button catalog2Button = (Catalog2Button) next;
            String str = catalog2Button != null ? catalog2Button.amazon : null;
            if (str == null) {
                str = chip.mopub;
            }
            interfaceC1982l.Signature(new C7108l(str, interfaceC1982l.smaato()), true);
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.PlayVkMix) {
            interfaceC1982l.Signature(new C3086l(12, chip.purchase, chip.billing, null, null), false);
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.Share) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", ((Catalog2ButtonAction.Share) catalog2ButtonAction).yandex);
            intent.setType("text/plain");
            Context context = this.f8079l;
            context.startActivity(Intent.createChooser(intent, context.getResources().getText(R.string.share)));
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
            C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).yandex), false, 6);
        }
        return Unit.INSTANCE;
    }
}
