package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.subs;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: lؘؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7297l implements InterfaceC3177l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public TemplateWrapper f15143l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f15146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5268l f15145l = new C5268l(this, true);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18262l f15144l = new C18262l(7);

    public C7297l(subs subsVar) {
        Objects.requireNonNull(subsVar);
    }

    public final PaneTemplate amazon() {
        C10902l c10902l = new C10902l();
        CarText carTextCreate = CarText.create("Hello, world!");
        if (carTextCreate.isEmpty()) {
            C8339l.metrica("The title cannot be null or empty");
            return null;
        }
        C8081l.billing.loadAd(carTextCreate);
        c10902l.yandex = carTextCreate;
        Row row = new Row(c10902l);
        C2097l c2097l = new C2097l();
        ArrayList arrayList = c2097l.yandex;
        arrayList.add(row);
        if (arrayList.size() <= 0) {
            C8339l.smaato("The pane is set to loading but is not empty, or vice versa");
            return null;
        }
        Pane pane = new Pane(c2097l);
        C4514l c4514l = new C4514l();
        c4514l.yandex = pane;
        Action action = Action.APP_ICON;
        C9310l c9310l = C9310l.smaato;
        Objects.requireNonNull(action);
        c9310l.yandex(Collections.singletonList(action));
        c4514l.loadAd = action;
        C9943l c9943l = C9943l.amazon;
        c9943l.getClass();
        int size = pane.getActions().size();
        int i = c9943l.yandex;
        if (size > i) {
            C8339l.metrica(AbstractC0653l.vip(i, "The number of actions on the pane exceeded the supported max of "));
            return null;
        }
        for (Row row2 : pane.getRows()) {
            if (row2 instanceof Row) {
                C5334l c5334l = c9943l.loadAd;
                Row row3 = row2;
                int i2 = c5334l.yandex;
                if (!c5334l.purchase && row3.getOnClickDelegate() != null) {
                    C8339l.metrica("A click listener is not allowed on the row");
                    return null;
                }
                if (!c5334l.amazon && row3.getToggle() != null) {
                    C8339l.metrica("A toggle is not allowed on the row");
                    return null;
                }
                CarIcon image = row3.getImage();
                if (image != null) {
                    if (!c5334l.crashlytics) {
                        C8339l.metrica("An image is not allowed on the row");
                        return null;
                    }
                    c5334l.billing.Signature(image);
                }
                if (row3.getTexts().size() > i2) {
                    C8339l.metrica(AbstractC0653l.vip(i2, "The number of lines of texts for the row exceeded the supported max of "));
                    return null;
                }
            } else if (!(row2 instanceof ConversationItem)) {
                C8339l.metrica("Unsupported item type: ".concat(row2.getClass().getSimpleName()));
                return null;
            }
        }
        C9310l.remoteconfig.yandex(pane.getActions());
        return new PaneTemplate(c4514l);
    }

    public final void crashlytics(EnumC14812l enumC14812l) {
        AbstractC9859l.loadAd(new RunnableC10311l(this, enumC14812l, 10));
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f15145l;
    }
}
