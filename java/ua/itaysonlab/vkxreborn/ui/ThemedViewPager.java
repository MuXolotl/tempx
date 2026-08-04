package ua.itaysonlab.vkxreborn.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.Keep;
import defpackage.AbstractC13209l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC2361l;
import defpackage.InterfaceC8959l;
import java.lang.reflect.Field;
import kotlin.Metadata;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lua/itaysonlab/vkxreborn/ui/ThemedViewPager;", "Llًؔؔ;", "Llٌْٟ;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setTheme", "()V", "refreshTheme", "Ljava/lang/reflect/Field;", "xLeftEdge", "Ljava/lang/reflect/Field;", "xRightEdge", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ThemedViewPager extends AbstractC2361l implements InterfaceC8959l {
    public static final int $stable = 8;
    private Field xLeftEdge;
    private Field xRightEdge;

    public ThemedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            this.xLeftEdge = AbstractC2361l.class.getDeclaredField("mLeftEdge");
            this.xRightEdge = AbstractC2361l.class.getDeclaredField("mRightEdge");
            this.xLeftEdge.setAccessible(true);
            this.xRightEdge.setAccessible(true);
            setTheme();
        } catch (NoSuchFieldException e) {
            this.xLeftEdge = null;
            this.xRightEdge = null;
            e.printStackTrace();
        }
    }

    private final void setTheme() {
        Field field = this.xLeftEdge;
        Object obj = field != null ? field.get(this) : null;
        EdgeEffect edgeEffect = obj instanceof EdgeEffect ? (EdgeEffect) obj : null;
        if (edgeEffect != null) {
            edgeEffect.setColor(AbstractC13209l.yandex(R.attr.global_accent));
        }
        Field field2 = this.xRightEdge;
        Object obj2 = field2 != null ? field2.get(this) : null;
        EdgeEffect edgeEffect2 = obj2 instanceof EdgeEffect ? (EdgeEffect) obj2 : null;
        if (edgeEffect2 != null) {
            edgeEffect2.setColor(AbstractC13209l.yandex(R.attr.global_accent));
        }
    }

    @Override // defpackage.InterfaceC8959l
    public void refreshTheme() {
        setTheme();
    }

    public ThemedViewPager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ThemedViewPager(Context context, AttributeSet attributeSet, int i, AbstractC1753l abstractC1753l) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
